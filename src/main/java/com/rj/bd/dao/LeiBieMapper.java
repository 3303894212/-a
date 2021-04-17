package com.rj.bd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rj.bd.leibie.entity.LeiBie;

public interface LeiBieMapper {

	List<LeiBie> queryAll();
@Insert("insert into leibie values(#{lb_id},#{lb_name})")
public void insertLB(LeiBie leiBie);

public void delete(LeiBie leiBie);

public void delete2(LeiBie leiBie);

@Select("select * from leibie where lb_id=#{lb_id}")
public LeiBie queryById(LeiBie leiBie);
@Update("UPDATE leibie SET lb_name = #{lb_name} WHERE lb_id = #{lb_id}")
public void edit(LeiBie leiBie);



}
