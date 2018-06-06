package com.tcs;

public class Student {
	private int rno;
	private String name;  
	private float marks;
	
	  
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public void displayInfo(){  
	    System.out.println("Hello: "+this.name);  
	} 
	
	public String toString(){
		return "Rno= "+this.rno+" ,Name= "+this.name+" ,Marks= "+this.marks;
	}
}
