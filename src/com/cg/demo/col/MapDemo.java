package com.cg.demo.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(10, "India");
		map.put(20, "China");
		map.put(40, "US");
		map.put(null, "US");
		map.put(20, "Srilanka");

		System.out.println(map);
		System.out.println(map.get(20));

		Map<String, String> states = new HashMap<>();
		
		states.put("MH", "Maharashtra");
		states.put("TS", "Telangana");
		states.put("KA", "Karnataka");
		System.out.println(states);

	}

}