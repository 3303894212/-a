package com.rj.bd.baofei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rj.bd.baofei.entity.BaoFei;
import com.rj.bd.dao.BaoFeiMapper;

@Transactional
@Service("baofeiService")
public class BaoFeiServiceImpl implements IBaoFeiService{
	@Autowired
	private BaoFeiMapper baoFeiMapper;
	public List<BaoFei> queryAll() {
		return baoFeiMapper.queryAll();
	}
	public void insertBF(BaoFei baoFei) {
		baoFeiMapper.insertBF(baoFei);
		
	}
	public void delete(BaoFei baoFei) {
		baoFeiMapper.delete(baoFei);
		
	}
	public BaoFei queryById(BaoFei baoFei) {
		return baoFeiMapper.queryById(baoFei);
	}
	public void edit(BaoFei baoFei) {
		baoFeiMapper.edit(baoFei);
		
	}
	public void editById(BaoFei baoFei) {
		baoFeiMapper.editById(baoFei);
		
	}

}
