package com.rj.bd.tonji.entity;

public class Tonji {

	private int geshu;
	private String zc_state;
	public int getGeshu() {
		return geshu;
	}
	public void setGeshu(int geshu) {
		this.geshu = geshu;
	}
	public String getZc_state() {
		return zc_state;
	}
	public void setZc_state(String zc_state) {
		this.zc_state = zc_state;
	}
	@Override
	public String toString() {
		return "Tonji [geshu=" + geshu + ", zc_state=" + zc_state + "]";
	}
	
}
