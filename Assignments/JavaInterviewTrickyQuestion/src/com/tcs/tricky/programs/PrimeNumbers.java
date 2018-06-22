package com.tcs.tricky.programs;

public class PrimeNumbers {

	public boolean checkPrime(int num){
		if(num<0){
			num=num*-1;
		}
		if(num%2==0){
			return false;
		}
		for(int i=3;i<Math.sqrt(num)-1;i+=2){
			if(num%i==0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		PrimeNumbers a=new PrimeNumbers();
		if(a.checkPrime(num)){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
		
	}

}
