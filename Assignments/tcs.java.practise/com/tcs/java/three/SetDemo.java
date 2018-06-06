package com.tcs.java.three;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(51);
		set1.add(75);
		set1.add(14);
		set1.add(60);
		set1.add(35);
		
		System.out.println("HashSet: "+set1);
		set1.add(51);
		System.out.println("Size: "+set1.size());
		System.out.println(set1);
		
		Set<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(51);
		set2.add(75);
		set2.add(14);
		set2.add(60);
		set2.add(35);
		
		System.out.println("LinkedHashSet: "+set2);
		set2.add(51);
		System.out.println("Size: "+set2.size());
		System.out.println(set2);
		
		Set<Integer> set3=new TreeSet<Integer>();
		set3.add(51);
		set3.add(75);
		set3.add(14);
		set3.add(60);
		set3.add(35);
		
		System.out.println("TreeSet: "+set3);
		set3.add(51);
		System.out.println("Size: "+set3.size());
		System.out.println(set3);
	}

}
