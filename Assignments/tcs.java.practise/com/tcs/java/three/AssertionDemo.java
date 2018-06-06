package com.tcs.java.three;

class Maths{
	public static int add(int a,int b){
		return a*b;
	}
}

public class AssertionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Main");
		try{
			System.out.println("4 and 5");
			assert (Maths.add(4, 5)==9);
			System.out.println("-1 and -2");
			assert Maths.add(-1, -2)==-3;
			System.out.println("3 and 0");
			assert Maths.add(3, 0)==3;
		}catch(AssertionError e){
			System.out.println("add function is not written correctly");
			System.exit(0);
		}
		System.out.println("All tests are passed");
	}

}
