package tcs.java.practice;

import java.util.Scanner;

public class ScannerCalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0,n2 = 0;
		char op=' ';
		System.out.println("Enter mathemtical expression in format <num1> <operator> <num2>");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			n1=sc.nextInt();
		}
		
		if(sc.hasNext()){
			op=sc.next().charAt(0);
		}
		
		if(sc.hasNextInt()){
			n2=sc.nextInt();
		}
		ScannerCalc obj1=new ScannerCalc(n1,op,n2);
		System.out.println("Result is: "+obj1.performOperation());
	}

}
