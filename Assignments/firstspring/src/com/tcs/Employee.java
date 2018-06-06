package com.tcs;

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	public Employee(int empId, String empName, float empSalary) {
		System.out.println("In consrtuctor");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id= "+this.empId+", Name= "+this.empName+", Salary="+this.empSalary;
	}

}
