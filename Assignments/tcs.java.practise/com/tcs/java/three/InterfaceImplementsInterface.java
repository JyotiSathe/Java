package com.tcs.java.three;

interface Abc{
	void show();
}

interface Pqr extends Abc{
	void display();
	//void show();
}

class Xyz implements Pqr{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}
	
}

public class InterfaceImplementsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj=new Xyz();
		obj.show();
		Pqr obj1=new Xyz();
		obj1.display();
		obj1.show();
	}

}
