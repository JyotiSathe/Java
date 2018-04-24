package com.ms.java.training.day1;

public class BreakWithLabelDemo {
	
	 public static void main(String[] args) {

	        int[][] arrayOfInts = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        };
	        
	        int searchfor = 12;

	        /*System.out.println(arrayOfInts.length);
	        System.out.println(arrayOfInts[0].length);

	        for (int i = 0; i < arrayOfInts.length; i++) {
	            
	        	for (int j = 0; j < arrayOfInts[i].length;j++) 
	        	{
	        		System.out.println("i="+i+" j="+j);
	        		System.out.println(arrayOfInts[i][j]);
	        	}
	        }*/
	        
	        int i;
	        int j = 0;
	        boolean foundIt = false;

	        
	    search: for (i = 0; i < arrayOfInts.length; i++) {
	            
	        	for (j = 0; j < arrayOfInts[i].length;j++) 
	        	{
	                if (arrayOfInts[i][j] == searchfor) {
	                    foundIt = true;
	                    break search;
	                }
	            }
	        }

	        if (foundIt) {
	            System.out.println("Found " + searchfor + " at " + i + ", " + j);
	        } else {
	            System.out.println(searchfor + " not in the array");
	        }
	    }
}
