package com.tcs.java.three;

public class TryCatchPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=5;
		try{
			System.out.println(a+++a/0);
		}catch(ArithmeticException e){
			System.out.println("a="+a);
		}*/
		
		int a=0;
		try{
			System.out.println("Hello"+a/0);
		}catch(ArithmeticException e){
			System.out.println("Test");
		}
	}

}
