package tcs.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeTest {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Id:");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Name:");
		String name=br.readLine();
		Employee e1=new Employee(id,name);
		e1.display();
	}

}
