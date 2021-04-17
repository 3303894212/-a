package com.rj.bd.tonji.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rj.bd.tonji.entity.Tonji;

@Transactional
@Service("tonjiService")
public class TonjiServiceImpl implements ITonjiService{

	@Autowired
	private com.rj.bd.dao.TonjiMapper tonjiMapper;
	
	public List<Tonji> queryAll() {
		return tonjiMapper.queryAll();
	}

	
}
