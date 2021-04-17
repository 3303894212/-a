package com.rj.bd.zichan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.rj.bd.zichan.entity.Zichan;
import com.rj.bd.zichan.service.IZichanService;



@CrossOrigin
@Controller("zichanController")
@RequestMapping("/zichan")
public class ZichanController {
	@Autowired
	IZichanService zichanService;
	/**
	 * 查询员工
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public List<Zichan> UserAll() {
		List<Zichan> list = zichanService.queryAll();
		System.out.println(list);
		return list;
	}
	/**
	 * @desc  添加
	 * @param 
	 * @return
	 */
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object>  insertZc(Zichan zichan){
		System.out.println(zichan);
		zichanService.insertZc(zichan);
		System.out.println(zichan);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		System.out.println(map);
		return map;
	}
	/**
	 * @desc  删除
	 * 
	 */
	@RequestMapping(value ="/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delete(Zichan zichan){
		zichanService.delete(zichan);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "删除成功");
		System.out.println(map);
		return map;
	}
	/**
	 * @desc  进入修改
	 * 
	 */
	@RequestMapping(value ="/editpage", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editpage(Zichan zichan){
		Zichan zichan2=zichanService.queryById(zichan);
		System.out.println(zichan2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		map.put("data", zichan2);
		return map;
	}
	/**
	 * @desc 修改保存
	 */
	@RequestMapping(value ="/edit", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(Zichan zichan){
		zichanService.edit(zichan);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "修改成功");
		return map;
	}
}
