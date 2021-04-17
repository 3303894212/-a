package com.rj.bd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rj.bd.baofei.entity.BaoFei;

public interface BaoFeiMapper {

public List<BaoFei> queryAll();
@Insert("insert into baofei values(#{bf_id},#{bf_date},#{bf_des},#{zc_id}) ")
public void insertBF(BaoFei baoFei);
@Delete("delete from baofei where bf_id=#{bf_id}")
public void delete(BaoFei baoFei);
@Select("select * from baofei where bf_id=#{bf_id}")
public BaoFei queryById(BaoFei baoFei);
@Update("UPDATE baofei SET bf_date = #{bf_date} ,bf_des = #{bf_des},zc_id = #{zc_id} WHERE bf_id = #{bf_id}")
public void edit(BaoFei baoFei);
@Update("UPDATE zichan SET zc_state='报废' WHERE zc_id=#{zc_id}")
public void editById(BaoFei baoFei);

}
