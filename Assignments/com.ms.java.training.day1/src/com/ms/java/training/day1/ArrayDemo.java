package com.ms.java.training.day1;

public class ArrayDemo {
	
	public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 5 integers
        anArray = new int[5];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
       

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 4: " + anArray[5]);
    }
} 


