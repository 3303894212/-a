package com.rj.bd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.rj.bd.zichan.entity.Zichan;

public interface ZichanMapper {
	public List<Zichan> queryAll();
	
	@Insert("insert into zichan values(#{zc_id},#{zc_name},#{zc_jiage},#{zc_date},#{zc_state},#{zc_des},#{lb_id},#{emp_id}) ")
	public void insertZc(Zichan zichan);
	@Delete("delete from zichan where zc_id=#{zc_id}")
	public void delete(Zichan zichan);
	@Select("select * from zichan where zc_id=#{zc_id}")
	public Zichan queryById(Zichan zichan);
	@Update("UPDATE zichan SET zc_name = #{zc_name} ,zc_jiage = #{zc_jiage},zc_date = #{zc_date},zc_state = #{zc_state},zc_des = #{zc_des},lb_id = #{lb_id},emp_id = #{emp_id} WHERE zc_id = #{zc_id}")
	public void edit(Zichan zichan);
}
