package com.tcs.java.three;

public class AdditionExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		System.out.println("startung program:");
		try{
			System.out.println("In try");
			num1=Integer.parseInt(args[0]);
			num2=Integer.parseInt(args[1]);
			System.out.println("End of try");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("In catch AIOOBE");
			System.out.println("You have not pass command line arguments");
		}
		int num3=num1+num2;
		int a=5+9;
		System.out.println("a="+a);
		System.out.println("Addition="+num3);
	}

}
