package tcs.java.practice;

public class Employee {
	
	String eName;
	int eId;
	Employee(int eId, String eName){
		this.eId=eId;
		this.eName=eName;
	}
	
	void display(){
		System.out.println("Employee Details:");
		System.out.println("Employee Id:"+this.eId);
		System.out.println("Employee Name:"+this.eName);
	}
}
