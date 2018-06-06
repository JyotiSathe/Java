package com.tcs.java.three;

abstract class X{
	public abstract void f1();
	void f2(){
		System.out.println("X:f2");
	}
	public X(){
		System.out.println("X:constuctor");
	}
	public static void test(){
		System.out.println("Test");
	}
}

class Y extends X{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("Y:f1");
	}
	Y(){
		System.out.println("Y:constuctor");
	}
}

public class AbstractClassConstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj=new Y();
		obj.f1();
		obj.f2();
		X.test();
	}

}
