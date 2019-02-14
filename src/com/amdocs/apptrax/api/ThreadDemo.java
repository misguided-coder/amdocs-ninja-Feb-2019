package com.amdocs.apptrax.api;

public class ThreadDemo {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new TaskA());
		thread1.start();
	
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("TaskB is going on");
			}
		});
		
		thread2.start();
		
		
		Thread thread3 = new Thread(() -> System.out.println("TaskC is going on"));
		thread3.start();
		
	}
}

class TaskA implements Runnable {
	@Override
	public void run() {
		System.out.println("TaskA is going on");
	}
}