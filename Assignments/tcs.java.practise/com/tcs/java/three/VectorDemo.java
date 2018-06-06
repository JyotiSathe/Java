package com.tcs.java.three;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List v1=new Vector<>();
		v1.add(11);
		v1.add("Jyoti");
		v1.add(8f);
		
		System.out.println(v1);
		
		List<Integer> v2=new Vector<Integer>();
		
		v2.add(1);
		v2.add(20);
		v2.add(30);
		v2.add(40);
		
		System.out.println(v2);
		
		int i=v2.get(1);
		System.out.println("Access elemet using index"+i);
		
		v2.remove(0);
		System.out.println("After removing"+v2);
		
		System.out.println("Size="+v2.size());
		
		boolean isPresent=v2.contains(19);
		System.out.println("19 is present in v2 "+isPresent);
		
		v2.set(1, 10);
		v2.add(1,1001);
		
		Iterator<Integer> it=v2.iterator() ;
		int index=0;
		while(it.hasNext()){
			int data=it.next();
			v2.set(index++, data+5);
		}
		
		System.out.println("After updating "+v2);
		
		List v3=new Vector();
		
		v3.add(15);
		v3.add(20);
		
		v2.addAll(v3);
		
		System.out.println("V2+V3= "+v2);
		System.out.println(v3);
	}

}
