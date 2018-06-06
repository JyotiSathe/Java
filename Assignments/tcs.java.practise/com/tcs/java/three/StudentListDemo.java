package com.tcs.java.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int Rno;
	String name;
	float marks;
	public Student(int rno, String name, float marks) {
		super();
		Rno = rno;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [Rno="+this.Rno+" ,Name="+this.name+" ,Marks="+this.marks+"]\n";
	}

	/*@Override
	public int compareTo(Student s2) {
		// TODO Auto-generated method stub
		Student s1=this;
		return s1.compareTo(s2.name);
	}

	private int compareTo(String name2) {
		// TODO Auto-generated method stub
		int flag=1;
		if(this.name.equals(name2)){
			flag=0;
		}
		return flag;
	}*/

	@Override
	public int compareTo(Student s2) {
		// TODO Auto-generated method stub
		Student s1=this;
		return s1.Rno==s2.Rno?0:s1.Rno>s2.Rno?1:-1;
	}
	
}

public class StudentListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student(17,"Jyo",75);
		list.add(s1);
		
		list.add(new Student(9,"Rob",81));
		list.add(new Student(5,"John",61));
		list.add(new Student(14,"Ruba",75));
		list.add(new Student(10,"Jason",71));
		
		Collections.sort(list);
		System.out.println(list);
	}
	

}
