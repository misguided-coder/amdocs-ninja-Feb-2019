package com.amdocs.apptrax.api;

import java.util.function.BiConsumer;

//API Design
public class BetterCalculatorService {

	public void cal(int value1,int value2,BiConsumer<Integer,Integer> consumer) {
		System.out.println("Inside BetterCalculatorService Start!!!!!");
		// 10 loc
		consumer.accept(value1,value2);
		// 20 loc
		System.out.println("Inside BetterCalculatorService Finish!!!!!");
	}
	
	public void cal(BiConsumer<Integer,Integer> consumer) {
		System.out.println("Inside BetterCalculatorService Start!!!!!");
		// 10 loc
		consumer.accept(10,10);
		// 20 loc
		System.out.println("Inside BetterCalculatorService Finish!!!!!");
	}
}
