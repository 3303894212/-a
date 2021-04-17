package com.rj.bd.weixiu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rj.bd.weixiu.entity.Weixiu;
import com.rj.bd.weixiu.service.IWeixiuService;

@CrossOrigin
@Controller("weixiuController")
@RequestMapping("/weixiu")
public class WeixiuController {

	@Autowired
	IWeixiuService weixiuService;
	
	/**
	 * 查询报废
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public List<Weixiu> UserAll() {
		List<Weixiu> list = weixiuService.queryAll();
		return list;
	}
	/**
	 * @desc  删除
	 * 
	 */
	@RequestMapping(value ="/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delete(Weixiu weixiu){
		System.out.println(weixiu);
		weixiuService.delete(weixiu);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "删除成功");
		return map;
	}
	
	/**
	 * @desc  进入修改
	 * 
	 */
	@RequestMapping(value ="/editpage", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editpage(Weixiu weixiu){
		Weixiu weixiu2=weixiuService.queryById(weixiu);
		System.out.println(weixiu2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		map.put("data", weixiu2);
		return map;
	}
	
	/**
	 * @desc 修改保存
	 */
	@RequestMapping(value ="/edit", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(Weixiu weixiu){
		weixiuService.edit(weixiu);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "修改成功");
		return map;
	}
	
	/**
	 * @desc  添加
	 * @param 
	 * @return
	 */
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object>  insertEmp(Weixiu weixiu){
		System.out.println(weixiu);
		weixiuService.insertWx(weixiu);
		weixiuService.edit2(weixiu);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		System.out.println(map);
		return map;
	}
}
