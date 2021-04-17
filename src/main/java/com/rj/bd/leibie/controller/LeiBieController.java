package com.rj.bd.leibie.controller;

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
import com.rj.bd.leibie.entity.LeiBie;
import com.rj.bd.leibie.service.ILeiBieService;

@CrossOrigin
@Controller("LeiBieController")
@RequestMapping("/leibie")
public class LeiBieController {
	@Autowired
	ILeiBieService leiBieService;
	/**
	 * @desc  查询
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public List<LeiBie> queryAll() {
		List<LeiBie> list = leiBieService.queryAll();
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
	public Map<String, Object>  insertBF(LeiBie leiBie){
		System.out.println(leiBie);
		leiBieService.insertLB(leiBie);
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
	public Map<String, Object> delete(LeiBie leiBie){
		leiBieService.delete(leiBie);
		leiBieService.delete2(leiBie);
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
	public Map<String, Object> editpage(LeiBie leiBie){
		System.out.println(leiBie);
		LeiBie leiBie2=leiBieService.queryById(leiBie);
		System.out.println(leiBie2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		map.put("data", leiBie2);
		return map;
	}
	/**
	 * @desc 修改保存
	 */
	@RequestMapping(value ="/edit", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(LeiBie leiBie){
		leiBieService.edit(leiBie);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "修改成功");
		return map;
	}
}
