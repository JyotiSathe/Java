package com.tcs.java.three;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(51);
		set1.add(75);
		set1.add(14);
		set1.add(60);
		set1.add(35);
		
		Iterator<Integer> it=set1.iterator();
		while(it.hasNext()){
			int data=it.next();
			System.out.println("data: "+data);
		}
		
		System.out.println(set1.contains(18));
		set1.remove(14);
		System.out.println("After removing 14: "+set1);
	}

}
