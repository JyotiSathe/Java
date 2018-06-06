package com.tcs.java.three;

interface One{
	public void f1();
	public void f2();
	public void f3();
}

abstract class Two implements One{
	public void f1(){
		System.out.println("Two:F1");
	}
}

class Three extends Two implements One{

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("Three:f2");
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("Three:f3");
	}
	
}

public class ClassExtendsAndImplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One obj=new Three();
		obj.f1();
		obj.f2();
		obj.f3();
	}

}
