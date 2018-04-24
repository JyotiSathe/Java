package com.ms.java.training.day1;

public class BitDemo {
	
	 public static void main(String[] args) {

		 System.out.println(Integer.toBinaryString(2 << 11)); 
		 
//		 Shifts binary 2(10) by 11 times to the left. Hence: 1000000000000

//		 2 from decimal numbering system in binary is as follows
//
//		 10
//		 now if you do
//
//		 2 << 11
//		 it would be , 11 zeros would be padded on the right side
//
//		 1000000000000
		
//		 left shifting results in multiplication by 2 (*2) in terms or arithmetic
//
//		 For example
//
//		 2 in binary 10, if you do <<1 that would be 100 which is 4

		 System.out.println(Integer.toBinaryString(2 << 1));  
		 
		 System.out.println(Integer.parseInt(Integer.toBinaryString(2 << 11), 2));  
		 
		 
		 
//		 4 in binary 100, if you do  <<1 that would be 1000 which is 8
		 
		 
		 System.out.println(Integer.toBinaryString(4 >> 1));  
		 System.out.println(Integer.parseInt(Integer.toBinaryString(4 >> 1), 2));  
		 
	    }
}
