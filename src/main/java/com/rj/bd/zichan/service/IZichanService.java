package com.rj.bd.zichan.service;

import java.util.List;


import com.rj.bd.zichan.entity.Zichan;


public interface IZichanService {
	List<Zichan> queryAll();
	void insertZc(Zichan zichan);

	void delete(Zichan zichan);

	Zichan queryById(Zichan zichan);

	void edit(Zichan zichan);
}
