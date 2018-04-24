package tcs.java.practice;

import java.util.Scanner;

public class FibonacciSer {
	int n;
	int f1=0,f2=1;
	int Fibonacci[];
	static Scanner sc;
	
	public FibonacciSer() {
		// TODO Auto-generated constructor stub
		FibonacciSer.sc=new Scanner(System.in);
	}
	
	public void getCount() {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements: ");
		this.n=sc.nextInt();
	}
	public void createArray() {
		// TODO Auto-generated method stub
		Fibonacci=new int[this.n];
	}
	public void performOp() {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<this.n;i++){
			temp=f1+f2;
			Fibonacci[i]=temp;
			f1=f2;
			f2=temp;
		}
	}
	public void printSeries() {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci Series is: ");
		System.out.print("{");
		for(int num: Fibonacci){
			System.out.print(num +",");
		}
		System.out.println("}");
	}
	
	
}
