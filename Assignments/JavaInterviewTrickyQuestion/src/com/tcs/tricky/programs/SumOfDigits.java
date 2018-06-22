package com.tcs.tricky.programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number");
		number=in.nextInt();
		
		String n=""+number;
		System.out.println(n);
		
		int sum=0;
		for(int i=0;i<n.length();i++){
			sum=sum+Integer.parseInt(n.charAt(i)+"");
		}
		System.out.println(sum);
		
		sum=0;
		while(number>0){
			sum+=number%10;
			number=number/10;
		}
		System.out.println(sum);
	}
	

}
