package com.rj.bd.baofei.entity;

public class BaoFei {
	
private int bf_id;
private String bf_date;
private String bf_des;
private int zc_id;
private String zc_name;
private String zc_jiage;

public int getBf_id() {
	return bf_id;
}
public void setBf_id(int bf_id) {
	this.bf_id = bf_id;
}
public String getBf_date() {
	return bf_date;
}
public void setBf_date(String bf_date) {
	this.bf_date = bf_date;
}
public String getBf_des() {
	return bf_des;
}
public void setBf_des(String bf_des) {
	this.bf_des = bf_des;
}
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
@Override
public String toString() {
	return "BaoFei [bf_id=" + bf_id + ", bf_date=" + bf_date + ", bf_des=" + bf_des + ", zc_id=" + zc_id + ", zc_name="
			+ zc_name + ", zc_jiage=" + zc_jiage + "]";
}

}
