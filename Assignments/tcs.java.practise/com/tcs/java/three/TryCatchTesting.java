package com.tcs.java.three;

public class TryCatchTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("ONE");
			try{
				throw new ArithmeticException();
			}catch(Exception e){
				System.out.println("SIX");
				try{
					System.out.println("EIGHT");
				}finally{
					System.out.println("NINE");
				}
			}finally{
				System.out.println("TWO");
				try{

				}catch(Exception e){
					System.out.println("FIVE");
				}finally{
					System.out.println("THREE");
					int i=7/0;
				}
				System.out.println("**********************");
			}
		}catch(ArithmeticException e){
			System.out.println("FOUR");
		}finally{
			System.out.println("SEVEN");
		}
		System.out.println("THIS WAS TRICKY");
	}
}