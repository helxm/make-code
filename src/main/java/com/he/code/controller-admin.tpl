package com.rainbowbus.controller.api;

import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

import com.rainbowbus.controller.base.BaseCtr;
import com.rainbowbus.bean.api.${modelName}Bean;
import com.rainbowbus.bean.base.ViewBean;
import com.rainbowbus.service.impl.api.${modelName}ServiceImpl;
import com.rainbowbus.utils.JsonUtils;
import com.rainbowbus.validate.Group;
/**
 * ${modelName} - ${tableName}
 * @author hesh
 *
 */
@RestController
@RequestMapping("/api/<% print modelName.toLowerCase() %>")
public class ${modelName}Ctr extends BaseCtr {
	private static Logger logger = Logger.getLogger(${modelName}Ctr.class);  
	@Autowired
	private ${modelName}ServiceImpl service;
	
	@RequestMapping(value = "/{id}")
	public ViewBean read(@PathVariable("id") Long id) {
		return JsonUtils.getSuccess("获取成功", service.selectByPrimaryKey(id));
	}
	
	@RequestMapping(value = "/list",produces = { MediaType.APPLICATION_JSON_VALUE})
	public ViewBean list(${modelName}Bean record
			,@RequestParam(value = "pageNum",required = false) Integer pageNum
			,@RequestParam(value = "pageSize",required = false) Integer pageSize
			) throws JSONException {
		if(pageNum != null){
			if(pageSize == null){
				pageSize = 10;
			}
			PageHelper.startPage(pageNum, pageSize);
		}
		return JsonUtils.getSuccess("获取成功", service.queryAll(record));
	}
	
	@RequestMapping(value = "/save\$${modelName}")
	public ViewBean update(@Validated(Group.class) ${modelName}Bean record,BindingResult result,
			Errors errors
			) throws Exception {
		if (result.hasErrors()) {
			return JsonUtils.getError(errors);
		}
		int flag ;
		record.setIsDelated('1');
		if(record.getId() != null){
			record.setUpdateName(user.getUsername());
			record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
			flag = service.updateByPrimaryKey(record);
		}else{
			record.setCreateName(user.getUsername());
			record.setUpdateName(user.getUsername());
			record.setCreateTime(new Timestamp(System.currentTimeMillis()));
			record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
			
			flag = service.insert(record);
		}
		logger.info("更新用户，操作人id： " + record.getCreateName());
		if(flag > 0 ){
			return JsonUtils.getSuccess("操作成功");
		}
		return JsonUtils.getError("操作失败");
	}
}
