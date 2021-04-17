package com.rj.bd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rj.bd.user.entity.User;

public interface UserMapper {
	@Select("select * from user where user_name=#{username} and user_password=#{password}")
	public List<User> queryAll(@Param("username")String username, @Param("password")String password);

	@Select("select * from user")
	public List<User> queryAll2();
	
	@Insert("insert into user values(#{user_id},#{user_name},#{user_password},#{img})")
	public void add(User user);
	@Delete("delete from user where user_id=#{user_id}")
	public void delete(User user);
	@Select("select * from user where user_id=#{user_id}")
	public User queryById(User user);
	@Update("UPDATE user SET user_name=#{user_name},user_password=#{user_password} WHERE user_id=#{user_id}")
	public void edit(User user);
	

}
