package com.rj.bd.weixiu.service;

import java.util.List;

import com.rj.bd.weixiu.entity.Weixiu;

public interface IWeixiuService {

	List<Weixiu> queryAll();
	
	void delete(Weixiu weixiu);
	
	void edit(Weixiu weixiu);

	Weixiu queryById(Weixiu weixiu);
	
	void insertWx( Weixiu weixiu );

	void edit2(Weixiu weixiu);

	
}
