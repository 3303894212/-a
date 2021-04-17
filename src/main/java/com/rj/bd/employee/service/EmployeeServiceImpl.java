package com.rj.bd.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rj.bd.dao.EmployeeMapper;
import com.rj.bd.employee.entity.Employee;
@Transactional
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService{


	@Autowired
	private EmployeeMapper employeeMapper;
	public List<Employee> queryAll() {
		return employeeMapper.queryAll();
	}

	public void insertEmp(Employee employee) {
		employeeMapper.insertEmp(employee);
		
	}

	public void delete(Employee employee) {
		employeeMapper.delete(employee);
		
	}

	public Employee queryById(Employee employee) {
		return employeeMapper.queryById(employee);
		
	}

	public void edit(Employee employee) {
		employeeMapper.edit(employee);
		
	}


}
