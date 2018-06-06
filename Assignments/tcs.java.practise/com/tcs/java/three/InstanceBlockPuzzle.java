package com.tcs.java.three;

public class InstanceBlockPuzzle {
	
	{
		System.out.println("Instance Block");
		fun();
	}

	public void fun(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InstanceBlockPuzzle();
	}

}
