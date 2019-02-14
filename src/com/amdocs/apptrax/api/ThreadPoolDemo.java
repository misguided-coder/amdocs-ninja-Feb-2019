package com.amdocs.apptrax.api;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for(int i=0;i<100;i++) {
			String taskName = "Task "+i;
			executor.execute(()-> System.out.printf("Task %s finished by thread %s %n!!!!",taskName,Thread.currentThread().getName()));
		
			executor.submit(()-> Math.random()+1000/2);
		}
	}
}

