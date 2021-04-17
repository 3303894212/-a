package com.rj.bd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rj.bd.employee.entity.Employee;

public interface EmployeeMapper {
@Select("select * from employee")
public List<Employee> queryAll();
@Insert("insert into employee values(#{emp_id},#{emp_name},#{emp_sex},#{emp_phone},#{emp_bumen}) ")
public void insertEmp(Employee employee);
@Delete("delete from employee where emp_id=#{emp_id}")
public void delete(Employee employee);
@Select("select * from employee where emp_id=#{emp_id}")
public Employee queryById(Employee employee);
@Update("UPDATE employee SET emp_name = #{emp_name} ,emp_sex = #{emp_sex},emp_phone = #{emp_phone},emp_bumen = #{emp_bumen} WHERE emp_id = #{emp_id}")
public void edit(Employee employee);

}
