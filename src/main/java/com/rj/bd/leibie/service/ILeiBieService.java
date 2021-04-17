package com.rj.bd.leibie.service;

import java.util.List;

import com.rj.bd.leibie.entity.LeiBie;

public interface ILeiBieService {

	List<LeiBie> queryAll();

	void insertLB(LeiBie leiBie);

	void delete(LeiBie leiBie);

	LeiBie queryById(LeiBie leiBie);

	void edit(LeiBie leiBie);

	void delete2(LeiBie leiBie);

}
