package com.rj.bd.user.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rj.bd.user.entity.User;

public interface IUserService {

	List<User> queryAll(@Param("username")String username,@Param("password") String password);

	List<User> queryAll2();

	void add(User user);

	void delete(User user);

	User queryById(User user);

	void edit(User user);



}
