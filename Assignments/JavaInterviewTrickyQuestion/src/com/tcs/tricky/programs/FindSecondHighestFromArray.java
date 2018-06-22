package com.tcs.tricky.programs;

import java.util.Arrays;

public class FindSecondHighestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={2,37,65,3,2,78,65,90};
		
		int largest=0;
		int secondLargest=0;
		
		for(int n:numbers){
			if(n>largest){
				secondLargest=largest;
				largest=n;
				
			}
			else if(n>secondLargest){
				secondLargest=n;
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length-1]);
		System.out.println(numbers[numbers.length-2]);
	}

}
