package com.cmcc.census.pugilist.dtos;

import java.util.Date;

import java.sql.Timestamp;

import com.cmcc.system.dto.DAO;
import com.hotpot.ms.dao.util.EntityMethoddesc;
import com.hotpot.ms.dao.util.Entitydesc;

@Entitydesc(tablename = "$tableName", pk = "id")
public class $modelName extends DAO {
	<% for(key in columns) {
		if(key.isKey == "YES"){
			print "@EntityMethoddesc(ispk = true)\n"
			print "private " + key.type + " " + key.name + ";//" + key.remarks + "\n"
		}else{
			print "private " + key.type + " " + key.name + ";//" + key.remarks + "\n"
	    }
  	}%> 
	<% 
	import com.he.code.CaptureStrUtil;
	for(key in columns) {
	    print "public " + key.type + " get" + CaptureStrUtil.captureName(key.name) + "(){\n" 
	    	 print "return " + key.name + ";\n"
		print "}\n"
		print "public void set" + CaptureStrUtil.captureName(key.name) + "(" + key.type + " " + key.name + "){\n" 
			print "this." + key.name + " = " +  key.name + ";\n"
		print "}\n"
  	}%> 
}