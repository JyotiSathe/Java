package com.ms.java.training.day1;

public class UnaryDemo {
	
	 public static void main(String[] args) {

	        int result = +1;
	        // result is now 1
	        System.out.println(result);

	        result--;
	        // result is now 0
	        System.out.println(result);

	        result++;
	        // result is now 1
	        System.out.println(result);

	        result = -result;
	        // result is now -1
	        System.out.println(result);

	        boolean success = false;
	        // false
	        System.out.println(success);
	        // true
	        System.out.println(!success);
	        
	        
	        
	        
	       //Pre and Post Example
	        
	        int i = 3;
	        i++;
	        // prints 4
	        System.out.println(i);
	        ++i;			   
	        // prints 5
	        System.out.println(i);
	        // prints 6
	        System.out.println(++i);
	        // prints 6
	        System.out.println(i++);
	        // prints 7
	        System.out.println(i);
	        
	        
	        
	        
	    }

}
