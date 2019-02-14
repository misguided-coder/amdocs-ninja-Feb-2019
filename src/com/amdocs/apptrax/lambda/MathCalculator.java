package com.amdocs.apptrax.lambda;

public class MathCalculator implements ICalculator {

	public void doCal(int arg1, int arg2) {
		System.out.println("Inside MathCalculator!!!!");
		System.out.printf("Result : %s%n", arg1 + arg2);
	}
}
