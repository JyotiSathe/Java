package com.tcs.java.three;

class InvalidNumberArgException extends Exception{
	public InvalidNumberArgException() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "InvalidNumberArgException: Please pass command line arguments";
	}
}

class InvalidDataException extends RuntimeException{
	
}

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			if(args.length<3){
				throw new InvalidNumberArgException();
			}
		}catch(InvalidNumberArgException e){
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
