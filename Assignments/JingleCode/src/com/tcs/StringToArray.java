package com.tcs;

public class StringToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig = "Hello World";
	    //declare the char array
	    char[] stringArray;
	   
	    //convert string into array using toCharArray() method of string class
	    stringArray = strOrig.toCharArray();
	   
	    //display the array
	    for(int index=0; index < stringArray.length; index++)
	      System.out.println(stringArray[index]);
	}

}
