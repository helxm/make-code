package com.pugilist.model;

import java.util.Date;

public class ShopOrdRecord {
    private Integer id;

	private String ord_no;

	private Date action_time;

	private Integer action_type;

	private String action_info;

	private String isDelated;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrd_no() {
		return ord_no;
	}

	public void setOrd_no(String ord_no) {
		this.ord_no = ord_no == null ? null : ord_no.trim();
	}

	public Date getAction_time() {
		return action_time;
	}

	public void setAction_time(Date action_time) {
		this.action_time = action_time;
	}

	public Integer getAction_type() {
		return action_type;
	}

	public void setAction_type(Integer action_type) {
		this.action_type = action_type;
	}

	public String getAction_info() {
		return action_info;
	}

	public void setAction_info(String action_info) {
		this.action_info = action_info == null ? null : action_info.trim();
	}

	public String getIsDelated() {
		return isDelated;
	}

	public void setIsDelated(String isDelated) {
		this.isDelated = isDelated == null ? null : isDelated.trim();
	}

	private String ord_no;

    private Date action_time;

    private Integer action_type;

    private String action_info;


    public String getOrd_no() {
        return ord_no;
    }

    public void setOrd_no(String ord_no) {
        this.ord_no = ord_no == null ? null : ord_no.trim();
    }

    public Date getAction_time() {
        return action_time;
    }

    public void setAction_time(Date action_time) {
        this.action_time = action_time;
    }

    public Integer getAction_type() {
        return action_type;
    }

    public void setAction_type(Integer action_type) {
        this.action_type = action_type;
    }

    public String getAction_info() {
        return action_info;
    }

    public void setAction_info(String action_info) {
        this.action_info = action_info == null ? null : action_info.trim();
    }
}