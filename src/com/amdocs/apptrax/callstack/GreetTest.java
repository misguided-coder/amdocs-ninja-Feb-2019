package com.amdocs.apptrax.callstack;

public class GreetTest {

	static Greet g;
	
	public static void main(String[] args) {
		Greet greet = null;
		System.out.println("Checkpoint 1");
		greet = new Greet();
		System.out.println("Checkpoint 2");
		System.out.println(greet.age);
		Greet grt = greet;
		g = grt;
		greet.hello();
		System.out.println("Checkpoint 3");
	}
}
