package com.rj.bd.leibie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rj.bd.dao.EmployeeMapper;
import com.rj.bd.dao.LeiBieMapper;
import com.rj.bd.leibie.entity.LeiBie;

@Transactional
@Service("leiBieService")
public class LeiBieServiceImpl implements ILeiBieService{
	@Autowired
	private LeiBieMapper leiBieMapper;
	public List<LeiBie> queryAll() {
		return leiBieMapper.queryAll();
	}
	public void insertLB(LeiBie leiBie) {
		leiBieMapper.insertLB(leiBie);
		
	}
	public void delete(LeiBie leiBie) {
		leiBieMapper.delete(leiBie);
		
	}
	public LeiBie queryById(LeiBie leiBie) {
		return leiBieMapper.queryById(leiBie);
	}
	public void edit(LeiBie leiBie) {
		leiBieMapper.edit(leiBie);
		
	}
	public void delete2(LeiBie leiBie) {
		leiBieMapper.delete2(leiBie);
		
	}


}
