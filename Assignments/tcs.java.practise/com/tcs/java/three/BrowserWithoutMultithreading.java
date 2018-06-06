package com.tcs.java.three;

public class BrowserWithoutMultithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			System.out.println("Browsing ... "+i+"%");
			Thread.sleep(500);
		}
		for(int i=1;i<=100;i++){
			System.out.println("Downloading ... "+i+"%");
			Thread.sleep(500);
		}
		for(int i=1;i<=100;i++){
			System.out.println("Printing ... "+i+"%");
			Thread.sleep(500);
		}
	}

}
