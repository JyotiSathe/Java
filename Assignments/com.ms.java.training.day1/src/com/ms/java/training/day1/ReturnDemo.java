package com.ms.java.training.day1;

public class ReturnDemo {
	
	
	public static void main(String args[]){
		
		System.out.println("Print in main");
		
		ReturnDemo returnDemo = new ReturnDemo();

		int b = returnDemo.printValue(5);
		
		System.out.println(b);
		
		return ;
	}

	public int printValue(int i)
	{
		return i;
	}
}
