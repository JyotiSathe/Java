package com.tcs.java.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedUncheckedException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		br.readLine();// checked exception
		
		//checkedFun();
		unckeckedFun();
	}

	
	public static void checkedFun() throws ClassNotFoundException{
		
	}
	
	public static void unckeckedFun() throws ArithmeticException{
		
	}
}
