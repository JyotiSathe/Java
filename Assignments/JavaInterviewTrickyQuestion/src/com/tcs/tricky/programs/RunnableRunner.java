package com.tcs.tricky.programs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	private int i;

	public Task(int i){
		this.i=i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("\nTask "+i+" started");
		for(int j=i*100;j<i*100+99;j++){
			System.out.print(j +" ");
		}
		System.out.println("\nTask "+i+" Done");
	}
}

public class RunnableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		
		executorService.shutdown();
	}

}
