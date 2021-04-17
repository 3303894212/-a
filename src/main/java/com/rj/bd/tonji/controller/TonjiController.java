package com.rj.bd.tonji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rj.bd.tonji.entity.Tonji;
import com.rj.bd.tonji.service.ITonjiService;
import com.rj.bd.utils.JsonUtil;

@CrossOrigin
@Controller("tonjiController")
@RequestMapping("/tonji")
public class TonjiController {

	@Autowired
	ITonjiService tonjiService;
	
	/**
	 * 查询统计
	 * @return
	 * @throws JsonProcessingException 
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String UserAll() throws JsonProcessingException {
		List<Tonji> list = tonjiService.queryAll();
		System.out.println(list);
		return JsonUtil.toJson(list);
	}
}
