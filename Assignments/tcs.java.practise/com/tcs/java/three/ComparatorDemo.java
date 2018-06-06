package com.tcs.java.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(14,"Fred",10000));
		list.add(new Emp(5,"Adam",16000));
		list.add(new Emp(11,"John",14000));
		list.add(new Emp(14,"Andrew",15000));
		
		Collections.sort(list,new EmpToComparator());
		System.out.println("List on ID:"+list);
		
		List<Emp> listBySalary=new ArrayList<Emp>();
		listBySalary.addAll(list);
		Collections.sort(listBySalary, new EmpSalary());
		System.out.println("List on Salary:"+listBySalary);
	}

}
class Emp{
	int id;
	String name;
	float salary;
	public Emp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp [id= "+this.id+" ,Name= "+this.name+" ,Salary="+this.salary+"]";
	}
}

class EmpToComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return e1.id==e2.id?0:e1.id>e2.id?1:-1;
	}
	
}

class EmpSalary implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.salary==o2.salary?0:o1.salary>o2.salary?1:-1;
	}
	
}