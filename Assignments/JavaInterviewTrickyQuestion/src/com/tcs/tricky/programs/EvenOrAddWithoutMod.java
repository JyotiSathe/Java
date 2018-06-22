package com.tcs.tricky.programs;

import java.util.Scanner;

public class EvenOrAddWithoutMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number");
		number=in.nextInt();
		
		if((number&1)==0){
			System.out.println(number+" is even");
		}else{
			System.out.println(number+" is odd");
		}
		
		if((number>>1)<<1==number){
			System.out.println(number+" is even");
		}else{
			System.out.println(number+" is odd");
		}
	}

}
