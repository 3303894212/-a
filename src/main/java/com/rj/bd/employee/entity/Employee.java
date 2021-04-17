package com.rj.bd.employee.entity;


public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_sex;
	private String emp_phone;
	private String emp_bumen;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_sex() {
		return emp_sex;
	}
	public void setEmp_sex(String emp_sex) {
		this.emp_sex = emp_sex;
	}
	public String getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}
	public String getEmp_bumen() {
		return emp_bumen;
	}
	public void setEmp_bumen(String emp_bumen) {
		this.emp_bumen = emp_bumen;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sex=" + emp_sex + ", emp_phone="
				+ emp_phone + ", emp_bumen=" + emp_bumen + "]";
	}
	
}
