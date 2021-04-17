package com.rj.bd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.rj.bd.tonji.entity.Tonji;

public interface TonjiMapper {

	@Select("SELECT COUNT(*) geshu ,zc_state FROM zichan  GROUP BY zc_state")
	public List<Tonji> queryAll();
}
