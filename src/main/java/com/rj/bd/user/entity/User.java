package com.rj.bd.user.entity;

public class User {
private String user_id;
private String user_name;
private String user_password;
private String img;

public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
@Override
public String toString() {
	return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password + ", img=" + img
			+ "]";
}


}
