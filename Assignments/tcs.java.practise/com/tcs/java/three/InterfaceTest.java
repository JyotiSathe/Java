package com.tcs.java.three;

interface A{
	void f1();
	int f3();
}

interface B{
	void f2();
	int f3();
}

class Test implements A,B{

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("f2");
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("f1");
	}

	@Override
	public int f3() {
		// TODO Auto-generated method stub
		System.out.println("f3");
		return 0;
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new Test();
		obj.f3();
		B obj1=new Test();
		obj1.f3();
	}
}
