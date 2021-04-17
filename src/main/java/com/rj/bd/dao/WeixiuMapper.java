package com.rj.bd.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rj.bd.employee.entity.Employee;
import com.rj.bd.weixiu.entity.Weixiu;

public interface WeixiuMapper {

	
	public List<Weixiu> queryAll();
	
	@Delete("delete from weixiu where wx_id=#{wx_id}")
	public void delete(Weixiu weixiu);
	
	@Update("UPDATE weixiu SET zc_id = #{zc_id} ,wx_date = #{wx_date},wx_des = #{wx_des} WHERE wx_id = #{wx_id}")
	public void edit(Weixiu weixiu);
	@Select("select * from weixiu where wx_id=#{wx_id}")
	public Weixiu queryById(Weixiu weixiu);
	@Insert("insert into weixiu values(#{wx_id},#{wx_date},#{zc_id},#{wx_des}) ")
	public void insertWx(com.rj.bd.weixiu.entity.Weixiu weixiu);
	@Update("UPDATE zichan SET zc_state='维修' WHERE zc_id=#{zc_id}")
	public void edit2(Weixiu weixiu);
}
