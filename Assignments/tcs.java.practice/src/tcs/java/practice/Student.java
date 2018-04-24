package tcs.java.practice;

public class Student {
	
	int rNo;
	String Name;
	Float Per;
	
	public Student(int rNo, String name, Float per) {
		// TODO Auto-generated constructor stub
		this.rNo=rNo;
		this.Name=name;
		this.Per=per;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Roll Number: "+this.rNo);
		System.out.println("Name: "+this.Name);
		System.out.println("Percentage: "+this.Per);
	}
	
}
