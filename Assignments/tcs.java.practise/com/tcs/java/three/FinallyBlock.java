package com.tcs.java.three;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=12,b=10;
			//int b=0;
			System.out.println(a/b);
			//System.exit(0);
		}
		catch(ArithmeticException e){
			try{
				System.out.println("Exception Occured");
			}finally{
				System.out.println("Inner finally");
			}
		}finally{
			System.out.println("Program End....");
		}
		System.out.println("Main End....");
	}

}
