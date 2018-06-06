package com.tcs.java.three;

public interface InterfaceA {
	float PI=3.14f;
	final int i=5;
	
	int add(int a,int b);
	abstract void fun();
}

class ClassB implements InterfaceA{

	int a,b;
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return this.a+this.b;
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("In fun");
	}
	
}

class InterfaceDemo{
	public static void main(String[] args) {
		InterfaceA obj=new ClassB();
		obj.add(5, 10);
		obj.fun();
		System.out.println(InterfaceA.PI);
		System.out.println(obj.i);
	}
}