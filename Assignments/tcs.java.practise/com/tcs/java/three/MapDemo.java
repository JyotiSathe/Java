package com.tcs.java.three;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(14, "Jason");
		map.put(4, "Fred");
		map.put(8, "Lucky");
		map.put(6, "Adams");
		map.put(3, "Rob");
		
		
		System.out.println(map);
		
		Map<Integer, String> linkedHashMap=new LinkedHashMap<Integer,String>();
		linkedHashMap.putAll(map);
		
		System.out.println(linkedHashMap);
		
		Map<Integer, String> treeMap=new TreeMap<Integer,String>();
		treeMap.putAll(map);
		
		System.out.println(treeMap);
	}

}
