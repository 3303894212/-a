package com.rj.bd.zichan.entity;

public class Zichan {
	private int zc_id;
	private String zc_name;
	private String zc_jiage;
	private String zc_date;
	private String zc_state;
	private String zc_des;
	private int lb_id;
	private int emp_id;
	private String lb_name;
	private String emp_name;
	public int getZc_id() {
		return zc_id;
	}
	public void setZc_id(int zc_id) {
		this.zc_id = zc_id;
	}
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
	public String getZc_date() {
		return zc_date;
	}
	public void setZc_date(String zc_date) {
		this.zc_date = zc_date;
	}
	public String getZc_state() {
		return zc_state;
	}
	public void setZc_state(String zc_state) {
		this.zc_state = zc_state;
	}
	public String getZc_des() {
		return zc_des;
	}
	public void setZc_des(String zc_des) {
		this.zc_des = zc_des;
	}
	public int getLb_id() {
		return lb_id;
	}
	public void setLb_id(int lb_id) {
		this.lb_id = lb_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getLb_name() {
		return lb_name;
	}
	public void setLb_name(String lb_name) {
		this.lb_name = lb_name;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Zichan [zc_id=" + zc_id + ", zc_name=" + zc_name + ", zc_jiage=" + zc_jiage + ", zc_date=" + zc_date
				+ ", zc_state=" + zc_state + ", zc_des=" + zc_des + ", lb_id=" + lb_id + ", emp_id=" + emp_id
				+ ", lb_name=" + lb_name + ", emp_name=" + emp_name + "]";
	}
	

	
	
}
