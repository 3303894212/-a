package com.rj.bd.weixiu.entity;

public class Weixiu {

	private String wx_id;
	private String wx_date;
	private String zc_id;
	private String wx_des;
	private String zc_name;
	private String zc_jiage;
	
	
	public String getZc_name() {
		return zc_name;
	}
	public void setZc_name(String zc_name) {
		this.zc_name = zc_name;
	}
	public String getZc_jiage() {
		return zc_jiage;
	}
	public void setZc_jiage(String zc_jiage) {
		this.zc_jiage = zc_jiage;
	}
	public String getWx_id() {
		return wx_id;
	}
	public void setWx_id(String wx_id) {
		this.wx_id = wx_id;
	}
	
	public String getWx_date() {
		return wx_date;
	}
	public void setWx_date(String wx_date) {
		this.wx_date = wx_date;
	}
	public String getZc_id() {
		return zc_id;
	}
	public void setZc_id(String zc_id) {
		this.zc_id = zc_id;
	}
	public String getWx_des() {
		return wx_des;
	}
	public void setWx_des(String wx_des) {
		this.wx_des = wx_des;
	}
	@Override
	public String toString() {
		return "Weixiu [wx_id=" + wx_id + ", wx_date=" + wx_date + ", zc_id=" + zc_id + ", wx_des=" + wx_des
				+ ", zc_name=" + zc_name + ", zc_jiage=" + zc_jiage + "]";
	}
	
	
}
