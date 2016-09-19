package com.he.code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.codehaus.groovy.control.CompilationFailedException;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import groovy.lang.Writable;
import groovy.text.SimpleTemplateEngine;
import groovy.text.Template;
import groovy.text.TemplateEngine;
import groovy.text.markup.MarkupTemplateEngine;
import groovy.text.markup.TemplateConfiguration;

public class GroovyUtils {
	
	public static Logger logger = Logger.getLogger(GroovyUtils.class);
	
	public static GroovyClassLoader loader = null;
	private static String url = "jdbc:mysql://121.42.44.216:3306/pugilistadmin_test?root=xxx&password=xxx&autoReconnect=true&failOverReadOnly=false&characterEncoding=utf8";
	private static String db = "pugilistadmin_test";
	public GroovyUtils() {
		if(loader == null){
			loader = new GroovyClassLoader(ClassLoader.getSystemClassLoader());
		}
	}
	/**
	 * 从数据库中获取表结构
	 * @param tableName
	 * @return
	 */
	public static List<Map<String, Object>> getTableInfo(String tableName){
		Connection conn = null;
        //String sql;
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
        // 避免中文乱码要指定useUnicode和characterEncoding
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
        // 下面语句之前就要先创建javademo数据库
 
        try {
            // 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
            // 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
            // or:
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            // or：
            // new com.mysql.jdbc.Driver();
 
            logger.info("成功加载MySQL驱动程序");
            // 一个Connection代表一个数据库连接
            conn = DriverManager.getConnection(url);
            // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
            DatabaseMetaData dbmd = conn.getMetaData();  
            ResultSet rs = dbmd.getColumns(db, null, tableName, null); 
            List<Map<String,Object>> columns = new ArrayList<>();
            while(rs.next()){  
                
                /** 
                 * 所有列如下： 
                 * TABLE_CAT String => 表类别（可为 null）  
                    TABLE_SCHEM String => 表模式（可为 null）  
                    TABLE_NAME String => 表名称  
                    COLUMN_NAME String => 列名称  
                    DATA_TYPE int => 来自 java.sql.Types 的 SQL 类型  
                    TYPE_NAME String => 数据源依赖的类型名称，对于 UDT，该类型名称是完全限定的  
                    COLUMN_SIZE int => 列的大小。  
                    BUFFER_LENGTH 未被使用。  
                    DECIMAL_DIGITS int => 小数部分的位数。对于 DECIMAL_DIGITS 不适用的数据类型，则返回 Null。  
                    NUM_PREC_RADIX int => 基数（通常为 10 或 2）  
                    NULLABLE int => 是否允许使用 NULL。  
                    columnNoNulls - 可能不允许使用 NULL 值  
                    columnNullable - 明确允许使用 NULL 值  
                    columnNullableUnknown - 不知道是否可使用 null  
                    REMARKS String => 描述列的注释（可为 null）  
                    COLUMN_DEF String => 该列的默认值，当值在单引号内时应被解释为一个字符串（可为 null）  
                    SQL_DATA_TYPE int => 未使用  
                    SQL_DATETIME_SUB int => 未使用  
                    CHAR_OCTET_LENGTH int => 对于 char 类型，该长度是列中的最大字节数  
                    ORDINAL_POSITION int => 表中的列的索引（从 1 开始）  
                    IS_NULLABLE String => ISO 规则用于确定列是否包括 null。  
                        YES --- 如果参数可以包括 NULL  
                        NO --- 如果参数不可以包括 NULL  
                    空字符串 --- 如果不知道参数是否可以包括 null  
                    SCOPE_CATLOG String => 表的类别，它是引用属性的作用域（如果 DATA_TYPE 不是 REF，则为 null）  
                    SCOPE_SCHEMA String => 表的模式，它是引用属性的作用域（如果 DATA_TYPE 不是 REF，则为 null）  
                    SCOPE_TABLE String => 表名称，它是引用属性的作用域（如果 DATA_TYPE 不是 REF，则为 null）  
                    SOURCE_DATA_TYPE short => 不同类型或用户生成 Ref 类型、来自 java.sql.Types 的 SQL 类型的源类型（如果 DATA_TYPE 不是 DISTINCT 或用户生成的 REF，则为 null）  
                    IS_AUTOINCREMENT String => 指示此列是否自动增加  
                                    YES --- 如果该列自动增加  
                                    NO --- 如果该列不自动增加  
                                    空字符串 --- 如果不能确定该列是否是自动增加参数  
     
                 */  
            	Map<String, Object> column = new HashMap<>();   
            	column.put("name", rs.getString("COLUMN_NAME"));
            	String type = "";
            	switch (rs.getInt("DATA_TYPE")) {
				case 4:
					type = "Integer";
					break;
				case -5:
					type = "Integer";
					break;
				case 5:
					type = "Integer";
					break;
				case -6:
					type = "Integer";
					break;
				case 1:
					type = "Character";
					break;
				case 91:
					type = "Timestamp";
					break;
				case 93:
					type = "Timestamp";
					break;
				case 12:
					type = "String";
					break;
				case 2004:
					type = "String";
					break;
				case 2005:
					type = "String";
					break;
				case 8:
					type = "Double";
					break;
				case 6:
					type = "Float";
					break;
				default:
					type = "Object";
					break;
				}
            	column.put("type", type);
            	column.put("size", rs.getInt("COLUMN_SIZE"));
            	column.put("remarks", rs.getString("REMARKS"));
            	column.put("nullable", rs.getInt("NULLABLE"));
            	column.put("isKey", rs.getString("IS_AUTOINCREMENT"));
            	columns.add(column);
                System.err.println(rs.getString("COLUMN_NAME") + " 类型=" + type + " 列大小=" + rs.getInt("COLUMN_SIZE") +   
                        " 注释=" + rs.getString("REMARKS") +  
                        " 是否允许为NULL=" + rs.getInt("NULLABLE"));  
                  
                //还有很多很多方法，在这里就不一一列举了  
                  
            }  
             return columns;
              
        } catch (SQLException e) {
        	 logger.error("MySQL操作错误");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
				conn.close();
			} catch (SQLException e) {
				logger.error("jdbc 连接关闭出错");
				e.printStackTrace();
			}
        }
		return null;
	}
	public static Class<?> loadClassFromFile(String filePath){
		Class<?> clzz = null;
		try {
			clzz = loader.parseClass(new File(filePath));//groovy脚本文件
		} catch (CompilationFailedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return clzz;
	}
	public static Object excuteMethod(Class<?> clzz,String methodName,Object params){
		try {
			GroovyObject groovyObject = (GroovyObject)clzz.newInstance();
			return groovyObject.invokeMethod(methodName,params); 
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		return null;
	}
	/**
	 * 生成标记语言XML-like markup (XML, XHTML, HTML5, …​)
	 * 
	 * he 
	 * 2016年9月14日
	 */
	public static void makeMarkup(){
		TemplateConfiguration config = new TemplateConfiguration();         
		MarkupTemplateEngine engine = new MarkupTemplateEngine(config);     
		Template template = null;
		try {
			template = engine.createTemplate("p('test template')");//结果：<p>test template</p>
		} catch (CompilationFailedException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}    
		Map<String, Object> model = new HashMap<>();                        
		Writable output = template.make(model);                             
		Writer writer = null;
		try {
			writer = new FileWriter("d:/text-groovy.html");//结果：<p>test template</p>
			output.writeTo(writer);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * 生成java代码
	 * 
	 * templ
	 * 	模板名（模板位置需在GroovyUtils同一路径下）
	 * model
	 * 	模板所需填充数据
	 * 
	 * he 
	 * 2016年9月14日
	 */
	public static void makeJava(Map<String, Object> model,String templ,String beanType,String path,String suffix){
		String className = (String) model.get("modelName");
		className += beanType;
		TemplateEngine engine = new SimpleTemplateEngine ();     
		Template template = null;
		try {//从当前路径获取文件
			File in = new File(GroovyUtils.class.getResource("").getPath() + templ);
			logger.info(in.getAbsolutePath());
			template = engine.createTemplate(in);//
		} catch (CompilationFailedException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}    
		Writable output = template.make(model);                             
		Writer writer = null;
		try {
			String fileName = className.contains(".xml") ? className : (className + suffix);
			File out = new File(path + File.separator + fileName);
			System.err.println(out.getAbsolutePath());
			writer = new FileWriter(out);//
			output.writeTo(writer);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void makeSystem(Map<String, Object> model){
		String systemPath = "E:\\work\\git\\pugilist_system\\src\\com\\cmcc\\census\\pugilist\\";
		//makeJava(model, "bean-system.tpl","",systemPath + "dtos",".java");
		//makeJava(model, "dao-system.tpl","DAO",systemPath + "daos",".java");
		//makeJava(model, "action-system.tpl","Action",systemPath + "actions",".java");
	}
	public static void makeAdmin(Map<String, Object> model){
		String adminPath = "E:\\work\\git\\pugilist_admin\\src\\com\\rainbowbus\\";
		makeJava(model, "bean-admin.tpl","Bean",adminPath + "bean\\api",".java");
		makeJava(model, "mapper-xml-admin.tpl","Mapper",adminPath + "mapper",".xml");
		makeJava(model, "mapper-admin.tpl","Mapper",adminPath + "mapper",".java");
		makeJava(model, "service-admin.tpl","Service",adminPath + "service",".java");
		makeJava(model, "service-impl-admin.tpl","ServiceImpl",adminPath + "service\\impl\\api",".java");
		makeJava(model, "controller-admin.tpl","Ctr",adminPath + "controller\\api",".java");
	}
	public static void main(String[] args) {
		//String table = "p_test_make_code";
		//String model = "TestMakeCode";//拳馆会员
		
		String table = "t_new_user_crm";
		String model = "GymUserNumber";//拳馆会员
		
		Map<String, Object> map = new HashMap<>();
		map.put("tableName", table);
		map.put("modelName", model);
		List<Map<String,Object>> columns = getTableInfo(table);
		map.put("columns", columns);
		makeSystem(map);
		makeAdmin(map);
		
		String path = GroovyUtils.class.getResource("").getPath();
	    System.out.println(path);//获取绝对路径
	    
	    
		
	}
}
