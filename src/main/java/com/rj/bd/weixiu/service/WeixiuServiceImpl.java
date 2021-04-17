package com.rj.bd.weixiu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rj.bd.dao.WeixiuMapper;
import com.rj.bd.weixiu.entity.Weixiu;

@Transactional
@Service("weixiuService")
public class WeixiuServiceImpl implements IWeixiuService {

	@Autowired
	private WeixiuMapper weixiuMapper;
	
	public List<Weixiu> queryAll() {
		return weixiuMapper.queryAll();
	}

	public void delete(Weixiu weixiu) {
		weixiuMapper.delete(weixiu);
	}

	public void edit(Weixiu weixiu) {
		weixiuMapper.edit(weixiu);
	}

	public Weixiu queryById(Weixiu weixiu) {
		return weixiuMapper.queryById(weixiu);
	}

	public void insertWx(Weixiu weixiu) {
		weixiuMapper.insertWx(weixiu);
	}

	public void edit2(Weixiu weixiu) {
		weixiuMapper.edit2(weixiu);
		
	}



	
}
