package com.tcs.java.three;

public class ExceptionPropogationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		/*try{
			fun1();
		}catch(NullPointerException e){
			System.out.println("Exception is handled");
		}*/
		fun1();
		System.out.println("Main end");
	}

	private static void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun1 start");
		fun2();
		System.out.println("fun1 end");
	}

	private static void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2 start");
		fun3();
		System.out.println("fun2 end");
	}

	private static void fun3() {
		// TODO Auto-generated method stub
		System.out.println("fun3 start");
		String s=null;
		System.out.println(s.length());
		System.out.println("fun3 end");
	}

}
