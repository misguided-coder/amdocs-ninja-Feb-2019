package com.amdocs.apptrax.api;

//Developer 2 using API
public class Client {

	public static void main(String[] args) {
		
		
		BetterCalculatorService betterCalculatorService = new BetterCalculatorService();
		betterCalculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a + b));
		
		betterCalculatorService.cal(100,400,(a, b) -> System.out.printf("Result : %s%n", a + b));
		

		CalculatorService calculatorService = new CalculatorService();
		calculatorService.cal((int a, int b) -> {
			System.out.printf("Result : %s%n", a + b);
		});
		calculatorService.cal((a, b) -> {
			System.out.printf("Result : %s%n", a + b);
		});

		calculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a * b));

		calculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a / b));

		calculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a - b));

		calculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a % b));

		calculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a * a));

		calculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a * a + 20));

		calculatorService.cal((a, b) -> System.out.printf("Result : %s%n", a * b - 200));

		// while(true) {}
	}
}
