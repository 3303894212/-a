package com.rj.bd.user.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rj.bd.dao.UserMapper;
import com.rj.bd.user.entity.User;

@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;

	public List<User> queryAll(@Param("username")String username, @Param("password")String password) {
		return userMapper.queryAll(username,password);
	}

	public List<User> queryAll2() {
		return userMapper.queryAll2();
	}

	public void add(User user) {
		userMapper.add(user);
		
	}

	public void delete(User user) {
		userMapper.delete(user);
		
	}

	public User queryById(User user) {
		return userMapper.queryById(user);
	}

	public void edit(User user) {
		userMapper.edit(user);
		
	}
	
}
