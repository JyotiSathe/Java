package com.tcs.java.three;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			if(args.length==0){
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
		}catch(IllegalArgumentException e){
			System.out.println("Please pass 2 command line arguments of type int");
		}
	}

}
