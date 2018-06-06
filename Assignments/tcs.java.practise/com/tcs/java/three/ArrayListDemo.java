package com.tcs.java.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("Aurangabad");
		list.add("Nashik");
		list.add("Mumbai");
		list.add("Nagpur");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		list.add("Jalgaon");
		System.out.println(list);
		
		int arr[]={6,4,7,2,5};
		Arrays.sort(arr);
		for(int data:arr){
			System.out.println(data);
		}
	}

}
