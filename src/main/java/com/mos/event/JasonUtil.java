package com.mos.event;

import com.google.gson.Gson;



public class JasonUtil {

	public static String toJason(Object obj) {		
		Gson gson = new Gson();	 
		String jsonStr = (gson.toJson(obj));	
		System.out.println(jsonStr);
		return jsonStr;
	}
}
