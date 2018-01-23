package com.mashape.unirest.http;

import java.util.HashMap;
import java.util.List;

public class Headers extends HashMap<String, List<String>> {

	private static final long serialVersionUID = 71310341388734766L;

	public String getFirst(Object key) {





		List<String> list = get(key);
		if (list != null && list.size() > 0) {
			System.out.println(list);
			return list.get(0);
		}
		return null;



	}



}
