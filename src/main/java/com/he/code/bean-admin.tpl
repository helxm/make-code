package com.rainbowbus.bean.api;

import java.sql.Timestamp;
import java.util.List;

import com.rainbowbus.bean.base.BaseBean;
/**
 * ${modelName}
 *
 * @author hesh
 * @date <% import java.util.Date; print new Date(); %>
 *
 */
public class ${modelName}Bean extends BaseBean {
	<% for(key in columns) {
		if(key.name != "id"
			&& key.name != "name"
			&& key.name != "createName"
			&& key.name != "createTime"
			&& key.name != "updateName"
			&& key.name != "updateTime"
			&& key.name != "isDelated"
			){
			print "private " + key.type + " " + key.name + ";//" + key.remarks + "\n"
		}
  	}%> 
	<% 
	import com.he.code.CaptureStrUtil;
	for(key in columns) {
		if(key.name != "id"
			&& key.name != "name"
			&& key.name != "createName"
			&& key.name != "createTime"
			&& key.name != "updateName"
			&& key.name != "updateTime"
			&& key.name != "isDelated"
			){
			    print "public " + key.type + " get" + CaptureStrUtil.captureName(key.name) + "(){\n" 
			    	 print "return " + key.name + ";\n"
				print "}\n"
				print "public void set" + CaptureStrUtil.captureName(key.name) + "(" + key.type + " " + key.name + "){\n" 
					print "this." + key.name + " = " +  key.name + ";\n"
				print "}\n"
		}
  	}%> 
}