package com.tcs.tricky.question;

import java.util.Arrays;

public class TrickyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=3/0;
		}
		catch(ArithmeticException e){
			System.out.println("In Catch");
			//System.exit(0);
		}
		finally{
			System.out.println("In finally");
		}
		
		Double b=1.0/0.0;
		System.out.println(b);
		
		char[] chars = new char[] {'\u0097'}; 
		String str = new String(chars); 
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes));

		System.out.println(0.1*3);
		System.out.println((0.1*3)==3);
		
		System.out.println((Integer)222);
	}
	
}
