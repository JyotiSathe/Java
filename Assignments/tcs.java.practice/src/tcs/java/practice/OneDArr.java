package tcs.java.practice;

import java.util.Scanner;

public class OneDArr {
	int n;
	int input[];
	int sum;

	static Scanner sc;

	public OneDArr(){
		OneDArr.sc=new Scanner(System.in);
	}


	public void readLengthArray(){
		System.out.println("Enter number of elaments");
		this.n=OneDArr.sc.nextInt();
	}

	public void createArray(){
		this.input=new int[this.n];
	}

	public void readElements(){

		for(int i=0;i<this.n;i++){
			System.out.println("Enter element "+(i+1));
			input[i]=OneDArr.sc.nextInt();
		}
	}

	public void addAllElements(){
		for(int i=0;i<this.n;i++){
			this.sum+=this.input[i];
		}
	}
	
	public void getResult(){
		System.out.println("Sum of all elemets in Array is "+this.sum);
	}
}
