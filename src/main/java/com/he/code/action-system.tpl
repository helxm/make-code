package com.cmcc.census.pugilist.actions;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.cmcc.census.pugilist.daos.${modelName}DAO;
import com.cmcc.census.pugilist.dtos.${modelName};
import com.cmcc.census.util.CensusUtil;
import com.cmcc.census.util.FileUpAndLoad2;
import com.cmcc.census.util.ReadProperties;
import com.cmcc.system.actions.BaseAction;
import com.cmcc.system.util.CodeUtil;

import net.sf.json.JSONObject;
/**
 * ${modelName} - ${tableName}
 * @author hesh
 *
 */
public class ${modelName}Action extends BaseAction{
	public Logger logger = Logger.getLogger("${modelName}Action");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ${modelName}DAO dao = new ${modelName}DAO();
	private ${modelName} bean;
	
	private String type;
	private String label;
	private String name;
	private String address;
	
	private String ids;
	
	/**
	 * 图片上传
	 */
	public File upload_one_file;
	public String upload_one_fileFileName;
	
	/**
	 * 转到主页面
	 */
	public String main() {
		return SUCCESS;
	}

	/**
	 * 新增框
	 */
	public String add() {
		return SUCCESS;
	}
	
	/**
	 * 获取订单列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String getList() throws Exception {
		StringBuffer sqlstr = new StringBuffer("select s.* from ${tableName} s ");
		//sqlstr.append(" LEFT JOIN t_new_user nu ON nu.`olduserid` = s.`userid` ");
		sqlstr.append(" where s.isDelated = '1'  ");
		if(StringUtils.isNotBlank(name)){
			sqlstr.append(" and s.name like '%" + CodeUtil.toChinese(name.trim()) + "%' ");
		}
		sqlstr.append(" order by s.id desc");
		return responseJosn(dao.search_ReturnJsonString(sqlstr.toString(), getRows(),getPage()));
	}
	
	/**
	 * 保存或者修改订单
	 */
	public String saveOrUpdate() throws Exception {
		JSONObject obj = new JSONObject();
		boolean flag = true;
		try {
			${modelName} bean = (${modelName}) vo;
			bean.setIsDelated('1');
			if (bean.getId() != null && !"".equals(bean.getId())) {
				flag = dao.update(bean);
			} else {
				flag = dao.insert(bean);
			}
			if (flag) {
				obj.put(CensusUtil.CODE, CensusUtil.CODE_RIGHT);
				obj.put(CensusUtil.MSG, CensusUtil.CODE_RIGHT_MSG);
			} else {
				obj.put(CensusUtil.CODE, CensusUtil.CODE_WRONG);
				obj.put(CensusUtil.MSG, CensusUtil.CODE_WRONG_MSG);
			}
		} catch (Exception e) {
			e.printStackTrace();
			obj.put(CensusUtil.CODE, CensusUtil.CODE_EXCEPTION);
			obj.put(CensusUtil.MSG, CensusUtil.CODE_EXCEPTION_MSG);
		}
		return responseJosn(obj.toString());
	}
	
	/**
	 * 点击修改按钮
	 */
	public String toUpdate() throws Exception {
		JSONObject obj = new JSONObject();
		String json = null;
		try {
			json = dao.get_RetrunJson(${modelName}.class, bean.getId());
			if (json != null) {
				obj.put(CensusUtil.CODE, CensusUtil.CODE_RIGHT);
				obj.put(CensusUtil.MSG, CensusUtil.CODE_RIGHT_MSG);
				obj.put(CensusUtil.CONTENT, json);
			} else {
				obj.put(CensusUtil.CODE, CensusUtil.CODE_WRONG);
				obj.put(CensusUtil.MSG, CensusUtil.CODE_WRONG_MSG);
			}
		} catch (Exception e) {
			// TODO: handle exception
			obj.put(CensusUtil.CODE, CensusUtil.CODE_EXCEPTION);
			obj.put(CensusUtil.MSG, CensusUtil.CODE_EXCEPTION_MSG);
		}
		return responseJosn(obj.toString());
	}
	
	/**
	 * 删除
	 */
	public String deletes() throws Exception {
		JSONObject obj = new JSONObject();
		boolean flag = true;
		try {
			flag = dao.update("update ${tableName} set isDelated='0' where id=" + ids);
			if (flag) {
				obj.put(CensusUtil.CODE, CensusUtil.CODE_RIGHT);
				obj.put(CensusUtil.MSG, CensusUtil.CODE_RIGHT_MSG);
			} else {
				obj.put(CensusUtil.CODE, CensusUtil.CODE_WRONG);
				obj.put(CensusUtil.MSG, CensusUtil.CODE_WRONG_MSG);
			}
		} catch (Exception e) {
			e.printStackTrace();
			obj.put(CensusUtil.CODE, CensusUtil.CODE_EXCEPTION);
			obj.put(CensusUtil.MSG, CensusUtil.CODE_EXCEPTION_MSG);
		}
		
		return responseJosn(obj.toString());
	}
	
	/************************************************拳手*******************************************/
	
	
	/**
	 * 上传图片
	 */
	public String uploadImg() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		// 上传图片的类型
		String type = "ranking";

		JSONObject obj = new JSONObject();
		// 创建文件
		String basePath = ReadProperties.downimgurl + "/" + "ranking";
		File file = new File(basePath);
		if (!file.exists()) {
			file.mkdirs();
		}
		try {
			if (upload_one_file != null) {
				// 检查像素
				BufferedImage bi = ImageIO.read(upload_one_file);
				if (bi == null) {
					obj.put("flag", false);
					obj.put("mess", "上传图片有误！");
					return responseJosn(obj.toString());
				}

				// 检查图片大小
				if (checkImgSize(upload_one_file, "3072000")) {
					obj.put("flag", false);
					obj.put("mess", "图片太大");
					return responseJosn(obj.toString());
				}

				// 检查像素
				/*
				 * if (upload_one_file.length() > 200 * 1024) { ResizeImage r1 =
				 * new ResizeImage(1024); r1.writeHighQuality(r1.zoomImage(bi),
				 * upload_one_file); } bi = ImageIO.read(upload_one_file);
				 */

				FileUpAndLoad2 fileUpAndLoad = new FileUpAndLoad2();
				System.out.println("图片上传真实路径===" + "basePath===" + basePath
						+ "/" + upload_one_fileFileName);
				Map<String, Object> map = fileUpAndLoad.saveFileV2(basePath,
						"", upload_one_file, type, upload_one_fileFileName);

				String ofilename = (String) map.get("filepath");
				String str = request.getScheme() + "://" + request.getServerName() + (request.getServerPort() == 80 ? "" : ":" + request.getServerPort());
				obj.put("url", str + "/img/ranking/" + ofilename.replace("/", ""));
			}
			obj.put("flag", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseJosn(obj.toString());
	}
	
	

	public ${modelName} getBean() {
		return bean;
	}
	public void setBean(${modelName} bean) {
		this.bean = bean;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
