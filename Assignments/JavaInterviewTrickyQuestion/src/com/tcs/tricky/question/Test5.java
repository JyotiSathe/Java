package com.tcs.tricky.question;

public class Test5 {


		public static void main(String args[])
		{
			MyClass mc=new MyClass();
			System.out.println(mc.key);
			System.out.println(mc.getNext());

		}

	}



	class MyClass {

		int key=-1;
		MyClass(){
			int  key=0;
		}

		public int getNext()
		{
			key++;

			return key;
		}
	}
