package com.rj.bd.zichan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rj.bd.dao.ZichanMapper;
import com.rj.bd.zichan.entity.Zichan;

@Transactional
@Service("zichanService")
public class ZichanServiceImpl implements IZichanService{
	@Autowired
	private ZichanMapper zichanMapper;
	
	public List<Zichan> queryAll() {
		// TODO Auto-generated method stub
		return zichanMapper.queryAll();
	}

	public void insertZc(Zichan zichan) {
		// TODO Auto-generated method stub
		zichanMapper.insertZc(zichan);
	}

	public void delete(Zichan zichan) {
		// TODO Auto-generated method stub
		zichanMapper.delete(zichan);
	}

	public Zichan queryById(Zichan zichan) {
		// TODO Auto-generated method stub
		return zichanMapper.queryById(zichan);
	}

	public void edit(Zichan zichan) {
		// TODO Auto-generated method stub
		zichanMapper.edit(zichan);
	}
	
}
