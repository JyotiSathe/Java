package com.tcs.tricky.programs;

import java.util.HashSet;
import java.util.Set;

public class HashCodeEqualsConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set1=new HashSet<Employee>();
		set1.add(new Employee(5, "Adams", 16000));
		Employee e1=new Employee(5,"Adams",16000);
		Employee e2=new Employee(5,"Adams",16000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		if(set1.contains(e1)){
			System.out.println("Adams is there");
		}else{
			System.out.println("Adams is lost");
		}
	}

}

class Employee{
	int id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp [id= "+this.id+" ,Name= "+this.name+" ,Salary="+this.salary+"]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) return true;
		
		if (obj instanceof Employee){
			Employee e=(Employee)obj;
			return this.id==e.id&&this.name.equals(e.name)&&this.salary==e.salary;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int) ((this.id*this.name.length())+this.salary);
	}
}