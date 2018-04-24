package tcs.java.practice;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rNo;
		String Name;
		Float Per;
		
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		rNo=sc.nextInt();
		System.out.println("Enter Name");
		Name=sc.next();
		System.out.println("Enter Salary");
		Per=sc.nextFloat();
		
		Student st=new Student(rNo,Name,Per);
		System.out.println("Entered Details:");
		st.display();
		
		@SuppressWarnings("resource")
		Scanner sc2=new Scanner(System.in);
		sc2.useDelimiter("#");
		System.out.println("Enter details in format EmployeeId#Name#Salary#");
		int r=sc2.nextInt();
		String n=sc2.next();
		float p=sc2.nextFloat();
		
		Student st2=new Student(r,n,p);
		st2.display();
	}

}
