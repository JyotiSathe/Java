package tcs.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("Enter your age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Entered Details:");
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}

}
