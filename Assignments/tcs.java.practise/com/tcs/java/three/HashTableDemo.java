package com.tcs.java.three;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new Hashtable<Integer, String>();
		
		map.put(14, "Jason");
		map.put(4, "Fred");
		map.put(8, "Lucky");
		map.put(6, "Adams");
		map.put(3, "Rob");
		map.put(5, "");
		
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		System.out.println("Keys="+keys);
		
		Iterator<Integer> it=keys.iterator();
		while(it.hasNext()){
			int key=it.next();
			String value=map.get(key);
			System.out.println(key+"<-->"+value);
		}
		map.remove(6);
		map.put(3, "Ruba");
		System.out.println(map);
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Adams"));
	}

}
