package com.rj.bd.leibie.entity;

public class LeiBie {
private int lb_id;
private String lb_name;
public int getLb_id() {
	return lb_id;
}
public void setLb_id(int lb_id) {
	this.lb_id = lb_id;
}
public String getLb_name() {
	return lb_name;
}
public void setLb_name(String lb_name) {
	this.lb_name = lb_name;
}
@Override
public String toString() {
	return "LeiBie [lb_id=" + lb_id + ", lb_name=" + lb_name + "]";
}

}
