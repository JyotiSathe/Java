package com.tcs.tricky.programs;

public class FindSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={45,85,74,5,6,25,89,3,54,20};
		
		int smallest=numbers[0];
		int secondSmallest=numbers[0];
		
		for(int n:numbers){
			if(n<smallest){
				secondSmallest=smallest;
				smallest=n;
			}else if(n<secondSmallest){
				secondSmallest=n;
			}
		}
		
		System.out.println(smallest);
		System.out.println(secondSmallest);
	}

}
