package com.tcs.java.three;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,5);
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.addAll(list);
		
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext()){
			int data=it.next();
			System.out.println("Data "+data);
		}
		
	}

}
