package com.rj.bd.baofei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rj.bd.baofei.entity.BaoFei;
import com.rj.bd.baofei.service.IBaoFeiService;
import com.rj.bd.employee.entity.Employee;


@CrossOrigin
@Controller("BaoFeiController")
@RequestMapping("/baofei")
public class BaoFeiController {
	@Autowired
	IBaoFeiService baoFeiService;
	/**
	 * @desc  查询
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public List<BaoFei> queryAll() {
		List<BaoFei> list = baoFeiService.queryAll();
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
	public Map<String, Object>  insertBF(BaoFei baoFei){
		System.out.println(baoFei);
		baoFeiService.insertBF(baoFei);
		baoFeiService.editById(baoFei);
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
	public Map<String, Object> delete(BaoFei baoFei){
		baoFeiService.delete(baoFei);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		return map;
	}
	/**
	 * @desc  进入修改
	 * 
	 */
	@RequestMapping(value ="/editpage", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editpage(BaoFei baoFei){
		BaoFei baoFei2=baoFeiService.queryById(baoFei);
		System.out.println(baoFei2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		map.put("data", baoFei2);
		return map;
	}
	/**
	 * @desc 修改保存
	 */
	@RequestMapping(value ="/edit", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(BaoFei baoFei){
		baoFeiService.edit(baoFei);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "修改成功");
		return map;
	}
}
