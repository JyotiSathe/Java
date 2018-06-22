package com.tcs.tricky.question;

public class Test6 {


	public static void main(String args[])
	{
		//ExampleClass ex=new ExampleClass();

		//System.out.println(ex.increase());

	}

}



class ExampleClass {

	int c=-2;
	private ExampleClass(){
		c=0;
	}

	public int increase()
	{
		c++;

		return c;
	}
}