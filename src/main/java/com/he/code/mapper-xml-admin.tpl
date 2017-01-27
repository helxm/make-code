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
    
    <select id="find" resultType="com.rainbowbus.bean.api.${modelName}Bean">
       select 
        	* 
        from 
        	${tableName} t1
        where 1=1
        
        <% columns.each{ n -> 
        	if(n.name == "isDelated"){
       			print "        <if test=\" isDelated == null \">  \n"; 
       			print "         and t1.isDelated = '1' \n"; 
       			print "        </if> \n"; 
       			
       			print "        <if test=\" isDelated != null \">  \n"; 
       			print "         and t1.isDelated = #{isDelated}  \n";
       			print "        </if> \n"; 
       		}
       		
        }%>
        	
        <% columns.eachWithIndex { 
       		n, i -> if(n.type == "String"){
       			print "        <if test=\"" + n.name + " != null and " + n.name + " != '' \"> \n"; 
       			print "          and t1." + n.name + " like CONCAT('%','\${" + n.name + "}','%' ) \n"; 
       			print "        </if> \n"; 
       		}else if(n.name == "isDelated" ) {
       			
       		}else if(n.type == "Character" || n.type == "Integer" || n.type == "Long") {
       			print "        <if test=\"" + n.name + " != null \"> \n"; 
       			print "        	and t1." + n.name + " = #{" + n.name + "} \n"; 
       			print "        </if> \n"; 
       		}
       		else if(n.type == "Timestamp" ) {
       			print "        <choose> \n"; 
		        print "           <when test=\"startTime != null and endTime != null\"> \n"; 
		        print "                and t1." + n.name + " BETWEEN #{startTime} and #{endTime}  \n"; 
		        print "           </when> \n"; 
		        print "           <when test=\"startTime != null and endTime == null\"> \n"; 
		        print "                and t1." + n.name + " &gt; #{startTime}  \n"; 
		        print "           </when> \n"; 
		        print "           <when test=\"startTime == null and endTime != null\"> \n"; 
		        print "                and t1." + n.name + " &lt; #{endTime}  \n"; 
		        print "           </when>
		        print "           <when test=\"" + n.name + " != null\"> \n"; 
		        print "                and CONVERT(t1." + n.name + ",DATE) = CONVERT(#{" + n.name + "},DATE) \n"; 
		        print "           </when> \n"; 
		        print "           <otherwise> \n"; 
		        print "           </otherwise> \n"; 
		        print "        </choose> \n"; 
       		}
       	}%>
    </select>   
   
    <delete id="deleteByPrimaryKey" parameterType="long">
       update ${tableName} set isDelated='0' where id=#{id}
    </delete>
    
    <select id="queryAll" resultType="com.rainbowbus.bean.api.${modelName}Bean" >
        select 
        	* 
        from 
        	${tableName} t1
        where 1=1
        
        <% columns.each{ n -> 
        	if(n.name == "isDelated"){
       			print "        <if test=\" isDelated == null \">  \n"; 
       			print "         and t1.isDelated = '1' \n"; 
       			print "        </if> \n"; 
       			
       			print "        <if test=\" isDelated != null \">  \n"; 
       			print "         and t1.isDelated = #{isDelated}  \n";
       			print "        </if> \n"; 
       		}
       		
        }%>
	       	
        <% columns.eachWithIndex { 
       		n, i -> if(n.type == "String"){
       			print "        <if test=\"" + n.name + " != null and " + n.name + " != '' \"> \n"; 
       			print "          and t1." + n.name + " like CONCAT('%','\${" + n.name + "}','%' ) \n"; 
       			print "        </if> \n"; 
       		}else if(n.name == "isDelated" ) {
       			
       		}else if(n.type == "Character" || n.type == "Integer"  || n.type == "Long") {
       			print "        <if test=\"" + n.name + " != null \"> \n"; 
       			print "        	and t1." + n.name + " = #{" + n.name + "} \n"; 
       			print "        </if> \n"; 
       		}
       		else if(n.type == "Timestamp" ) {
       			print "        <choose> \n"; 
		        print "           <when test=\"startTime != null and endTime != null\"> \n"; 
		        print "                and t1." + n.name + " BETWEEN #{startTime} and #{endTime}   \n"; 
		        print "           </when> \n"; 
		        print "           <when test=\"startTime != null and endTime == null\"> \n"; 
		        print "                and t1." + n.name + " &gt; #{startTime}  \n"; 
		        print "           </when> \n"; 
		        print "           <when test=\"startTime == null and endTime != null\"> \n"; 
		        print "                and t1." + n.name + " &lt; #{endTime}  \n"; 
		        print "           </when>
		        print "          <when test=\"" + n.name + " != null\"> \n"; 
		        print "                and CONVERT(t1." + n.name + ",DATE) = CONVERT(#{" + n.name + "},DATE) \n"; 
		        print "           </when> \n"; 
		        print "           <otherwise> \n"; 
		        print "           </otherwise> \n"; 
		        print "        </choose> \n"; 
       			
       		}
       	}%>
    </select>
    
    <select id="countAll" resultType="long" >
        select 
        	count(1) 
        from 
        	${tableName} t1
        where 1=1
        
        <% columns.each{ n -> 
        	if(n.name == "isDelated"){
       			print "        <if test=\" isDelated == null \">  \n"; 
       			print "         and t1.isDelated = '1' \n"; 
       			print "        </if> \n"; 
       			
       			print "        <if test=\" isDelated != null \">  \n"; 
       			print "         and t1.isDelated = #{isDelated}  \n";
       			print "        </if> \n"; 
       		}
       		
        }%>
	       	
        <% columns.eachWithIndex { 
       		n, i -> if(n.type == "String"){
       			print "        <if test=\"" + n.name + " != null and " + n.name + " != '' \"> \n"; 
       			print "          and t1." + n.name + " like CONCAT('%','\${" + n.name + "}','%' ) \n"; 
       			print "        </if> \n"; 
       		}else if(n.name == "isDelated" ) {
       			
       		}else if(n.type == "Character" || n.type == "Integer"  || n.type == "Long") {
       			print "        <if test=\"" + n.name + " != null \"> \n"; 
       			print "        	and t1." + n.name + " = #{" + n.name + "} \n"; 
       			print "        </if> \n"; 
       		}
       		else if(n.type == "Timestamp" ) {
       			print "        <choose> \n"; 
		        print "           <when test=\"startTime != null and endTime != null\"> \n"; 
		        print "                and t1." + n.name + " BETWEEN #{startTime} and #{endTime}   \n"; 
		        print "           </when> \n"; 
		        print "           <when test=\"startTime != null and endTime == null\"> \n"; 
		        print "                and t1." + n.name + " &gt; #{startTime}  \n"; 
		        print "           </when> \n"; 
		        print "           <when test=\"startTime == null and endTime != null\"> \n"; 
		        print "                and t1." + n.name + " &lt; #{endTime}  \n"; 
		        print "           </when>
		        print "          <when test=\"" + n.name + " != null\"> \n"; 
		        print "                and CONVERT(t1." + n.name + ",DATE) = CONVERT(#{" + n.name + "},DATE) \n"; 
		        print "           </when> \n"; 
		        print "           <otherwise> \n"; 
		        print "           </otherwise> \n"; 
		        print "        </choose> \n"; 
       			
       		}
       	}%>
        
    </select>
    
</mapper>