package com.amdocs.apptrax.api;

//API Design
public class CalculatorService {

	public void cal(ICalculator calculator) {
		System.out.println("Inside CalculatorService Start!!!!!");
		// 10 loc
		calculator.doCal(2, 2);
		// 20 loc
		System.out.println("Inside CalculatorService Finish!!!!!");
	}
}
