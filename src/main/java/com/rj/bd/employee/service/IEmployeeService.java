package com.rj.bd.employee.service;

import java.util.List;

import com.rj.bd.employee.entity.Employee;

public interface IEmployeeService {

	List<Employee> queryAll();

	void insertEmp(Employee employee);

	void delete(Employee employee);

	Employee queryById(Employee employee);

	void edit(Employee employee);

}
