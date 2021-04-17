package com.rj.bd.baofei.service;

import java.util.List;

import com.rj.bd.baofei.entity.BaoFei;

public interface IBaoFeiService {

	List<BaoFei> queryAll();

	void insertBF(BaoFei baoFei);

	void delete(BaoFei baoFei);

	BaoFei queryById(BaoFei baoFei);

	void edit(BaoFei baoFei);

	void editById(BaoFei baoFei);

}
