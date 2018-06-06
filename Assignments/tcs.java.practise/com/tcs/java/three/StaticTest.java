package com.tcs.java.three;

class Test3{
	static int i;
	int j;
	static{
		i=10;
		System.out.println("Static called");
		//test();
	}
	Test3(){
		System.out.println("Constuctor called");
	}
	
	/*public static void test(){
		
	}*/
}

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test3.i);
		Test3 obj=new Test3();
		Test3 obj1=new Test3();
	}

}
