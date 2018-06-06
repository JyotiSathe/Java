package com.tcs.java.three;

class Movie{
	Movie(){
		System.out.println("Movie constructor");
	}
	{
		System.out.println("Movie Instance");
	}
}

class HorrorMovie extends Movie{
	HorrorMovie(){
		System.out.println("HorrorMovie constructor");
	}
	{
		System.out.println("HorrorMovie Instance");
	}
}

public class InstanceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HorrorMovie();
	}

}
