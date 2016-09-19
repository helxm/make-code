<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
 
<mapper namespace="com.rainbowbus.mapper.${modelName}Mapper">
    <insert id="insert" parameterType="com.rainbowbus.bean.api.${modelName}Bean" useGeneratedKeys="true" keyColumn="id">
       insert into 
       		${tableName} 
       		(<% columns.eachWithIndex { 
       				n, i -> if(i == 0)print n.name; else print "," + n.name;
       		}%>)
       values
       		(<% columns.eachWithIndex { 
       				n, i -> if(i == 0)print "#{" + n.name + "}"; else print ",#{" + n.name + "}";
       		}%>)
    </insert>
   
    <update id="updateByPrimaryKey" parameterType="com.rainbowbus.bean.api.${modelName}Bean">
       update 
       		${tableName} 
       set 
       		<% columns.eachWithIndex { 
       				n, i -> if(i == 0)print n.name + "=#{" + n.name + "}"; else print "," + n.name + "=#{" + n.name + "}";
       		}%>
       	where 
       		id=#{id}
    </update>
   
    <select id="selectByPrimaryKey" resultType="com.rainbowbus.bean.api.${modelName}Bean">
       SELECT 
       	*
       from 
       	${tableName} 
       where 
       	id=#{id}
    </select>   
   
    <delete id="deleteByPrimaryKey" parameterType="long">
       update ${tableName} set isDelated='0' where id=#{id}
    </delete>
    
    <select id="queryAll" resultType="com.rainbowbus.bean.api.${modelName}Bean" >
        select * from ${tableName} where isDelated='1'
    </select>
    
</mapper>