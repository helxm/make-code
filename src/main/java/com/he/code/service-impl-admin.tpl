package com.rainbowbus.service.impl.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainbowbus.bean.api.${modelName}Bean;
import com.rainbowbus.mapper.${modelName}Mapper;
import com.rainbowbus.service.${modelName}Service;
import com.rainbowbus.service.base.AbstractService;

@Service
public class ${modelName}ServiceImpl extends AbstractService<${modelName}Bean,Long> implements ${modelName}Service  {
	@Autowired
	private ${modelName}Mapper mapper;  
	
	
	/**
	 * 给baseMapper赋值
	 */
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(mapper);
		
	}
}
