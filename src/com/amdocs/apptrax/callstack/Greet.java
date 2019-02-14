package com.amdocs.apptrax.callstack;

public class Greet {
	
	String name = "Jaggu";
	String city = "Noida";
	int age = 30;
	
	public void hello() {
		System.out.println("Hello to All");
		//10 loc
		hi();
		//20 loc
		System.out.println("Hello Done");
	}

	public void hi() {
		System.out.println("Hi to All");
		//20 loc
		//if(true)
			//throw new ArithmeticException();
		bye();
		//5 loc
		System.out.println("Hi Done");
	}

	public void bye() {
		System.out.println("Bye to All");
		//100 loc
		System.out.println("Bye Done");
	}
}
