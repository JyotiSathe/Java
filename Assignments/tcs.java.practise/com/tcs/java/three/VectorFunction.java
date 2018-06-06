package com.tcs.java.three;

import java.util.Vector;

public class VectorFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(4);
		v1.add(2);
		v1.add(12);
		v1.add(0);
		System.out.println("V1 capacity"+v1.capacity());
		
		v1.remove(new Integer(4));
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
		
		Vector<Integer> v2=new Vector<Integer>(3);
		v2.add(4);
		v2.add(2);
		v2.add(12);
		v2.add(0);
		System.out.println("V2 capacity"+v2.capacity());
	}

}
