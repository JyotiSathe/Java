package com.tcs.java.three;

public class FinallyPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=fun(5);
		System.out.println("Result: "+res);	
	}
	public static int fun(int a){
		try{
			a=a*2;
			//a=a/0; finally will execute a will be 20, but will not be printed, Line 8 will not be executed.
			//a=a/0;
			return a;
		}/*catch(ArithmeticException e){
			
		}*/finally{
			a=a*4;
			//System.out.println("a: "+a);
			//return a;
		}
		//return a;
	}

}
