package tcs.java.practice;

import java.util.Scanner;

public class Fibbo {
	int n;
	int fibbonacci[];
	static Scanner sc;
	
	public Fibbo(){
		Fibbo.sc=new Scanner(System.in);
	}

	public void getArrayCount(){
		System.out.println("Enter number of elements");
		this.n=sc.nextInt();
	}
	
	public int[] generateFibbo(){
		int[] temp=new int[this.n];
		temp[0]=0;
		temp[1]=1;
		
		for(int i=2;i<n;i++){
			temp[i]=temp[i-1]+temp[i-2];
		}
		
		return temp;
	}

	public void printFibbo(int[] f) {
		// TODO Auto-generated method stub
		for(int num:f){
			System.out.print(num +",");
		}
	}
}
