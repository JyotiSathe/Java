package com.tcs.java.three;

class A1{
	{
		System.out.println("Instance:A");
	}
	static{
		System.out.println("A static");
	}
	A1(){
		System.out.println("A constructor");
	}
}

class B1 extends A1{
	{
		System.out.println("Instance:B1");
	}
	static{
		System.out.println("B1 static");
	}/*
	B1(){
		System.out.println("B1 constructor");
	}*/
}

class C1 extends B1{
	/*{
		System.out.println("Instance:C1");
	}*/
	static{
		System.out.println("C1 static");
	}
	C1(){
		System.out.println("C1 constructor");
	}
}

public class InstanceStaticMix {

	{
		System.out.println("Instance: main");
	}
	static{
		System.out.println("Static:main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj1=new B1();
		C1 obj2=new C1();
	}

}
