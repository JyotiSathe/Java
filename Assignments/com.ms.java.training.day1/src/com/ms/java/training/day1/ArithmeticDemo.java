package com.ms.java.training.day1;

public class ArithmeticDemo {
	
	 public static void main (String[] args) {

	        int result = 1 + 2;
	        
	        System.out.println("1 + 2 = " + result);
	       
	        int original_result = result;

	        result = result - 1;
	        
	        System.out.println(original_result + " - 1 = " + result);
	        
	        original_result = result;

	        result = result * 2;
	       
	        System.out.println(original_result + " * 2 = " + result);
	        original_result = result;

	        result = result / 2;
	       
	        System.out.println(original_result + " / 2 = " + result);
	        original_result = result;

	        result = result + 8;
	        System.out.println(original_result + " + 8 = " + result);
	        original_result = result;

	        result = result % 7;
	        /* 
	         %" which divides one operand by another and returns the remainder as its result.
	         */
	        System.out.println(original_result + " % 7 = " + result);
	        
	        
	        
	        //String Concat demo
	        String firstString = "This is ";
	        String secondString = "a concatenated string.";
	        String thirdString = firstString+secondString;
	       // System.out.println(thirdString);
	        
	        System.out.println(firstString+ secondString);
	        
	        System.out.println(thirdString);
	    }

}
