package com.rj.bd.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rj.bd.employee.entity.Employee;
import com.rj.bd.employee.service.IEmployeeService;

@CrossOrigin
@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;
	/**
	 * 查询员工
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> UserAll() {
		List<Employee> list = employeeService.queryAll();
		//System.out.println(list);
		return list;
	}
	/**
	 * @desc  添加
	 * @param 
	 * @return
	 */
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object>  insertEmp(Employee employee){
		System.out.println(employee);
		employeeService.insertEmp(employee);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		System.out.println(map);
		return map;
	}
	/**
	 * @desc  删除
	 * 
	 */
	@RequestMapping(value ="/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delete(Employee employee){
		employeeService.delete(employee);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		return map;
	}
	/**
	 * @desc  进入修改
	 * 
	 */
	@RequestMapping(value ="/editpage", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editpage(Employee employee){
		 Employee employee2=employeeService.queryById(employee);
		System.out.println(employee2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		map.put("data", employee2);
		return map;
	}
	/**
	 * @desc 修改保存
	 */
	@RequestMapping(value ="/edit", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(Employee employee){
		employeeService.edit(employee);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "修改成功");
		return map;
	}
	
}
