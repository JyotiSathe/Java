package com.tcs.tricky.programs;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		
		SwapWithoutThirdVariable obj=new SwapWithoutThirdVariable();
		obj.swapUsingAddSubtract(a, b);
		obj.swapUsingBitwise(a, b);
		obj.swapUsingMultiplyDivision(a, b);

	}

	public void swapUsingBitwise(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping");
		System.out.println(a+" "+b);
	}

	public void swapUsingAddSubtract(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println(a+" "+b);
	}
	
	public void swapUsingMultiplyDivision(int a,int b){
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping");
		System.out.println(a+" "+b);
	}
}
