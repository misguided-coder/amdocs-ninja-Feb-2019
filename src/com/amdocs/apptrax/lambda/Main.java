package com.amdocs.apptrax.lambda;

public class Main {

	public static void main(String[] args) {
		// Before Java 8
		ICalculator calculator1 = new MathCalculator();
		calculator1.doCal(10, 2);

		System.out.println("==========================");

		// Before Java 8
		ICalculator calculator2 = new ICalculator() {

			@Override
			public void doCal(int arg1, int arg2) {
				System.out.println("Inside Anonyous class!!!!");
				System.out.printf("Result : %s%n", arg1 + arg2);
			}
		};

		calculator2.doCal(10, 2);

		System.out.println("==========================");
		
		// Java 8 onwards
		ICalculator calculator3 =   (int arg1, int arg2) -> {
				System.out.println("Inside Lambda!!!!");
				System.out.printf("Result : %s%n", arg1 + arg2);
		};
		
		calculator3.doCal(10, 2);

		System.out.println("==========================");
		
		// Java 8 onwards
		ICalculator calculator4 =   (arg1, arg2) -> {
				System.out.println("Inside Lambda!!!!");
				System.out.printf("Result : %s%n", arg1 + arg2);
		};
		
		calculator4.doCal(10, 2);

		
		
	}
}
