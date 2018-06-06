package com.tcs.java.three;

class PrintingThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			System.out.println("Printing ... "+i+"%");
			//Thread.sleep(500);
		}
	}
}

class DownloadThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			System.out.println("Downloading ... "+i+"%");
			//Thread.sleep(500);
		}
		
	}
}

public class ThreadWithMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//which extends Thread
		PrintingThread t1=new PrintingThread();
		t1.start();
		
		// which implements Runnable
		DownloadThread t2=new DownloadThread();
		Thread t=new Thread(t2);
		t.start();
		for(int i=1;i<=100;i++){
			System.out.println("Browsing ... "+i+"%");
		}
			
	}

}
