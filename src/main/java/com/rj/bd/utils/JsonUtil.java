package com.rj.bd.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	/**
	 * @desc 将对象转成json输出
	 * @param object
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String toJson(Object object) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
	}
}
