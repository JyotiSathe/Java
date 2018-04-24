package com.tcs.java.training.exam;

public class TestStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStr p=new TestStr();
		p.start();
		int x = 0x80000000;
		System.out.println(x);
		x = x >>> 31;
        System.out.println(x);
        
        

	}
	
	void start(){
		String s1="slip";
		String s2=fix(s1);
		System.out.println(s1+" "+s2);
	}

	String fix(String s1){
		s1=s1+"stream";
		System.out.print(s1+ " ");
		return "stream";
	}
}
