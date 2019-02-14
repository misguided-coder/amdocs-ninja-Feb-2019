package com.amdocs.apptrax.decorator;

public class PizzaOutlet {

	public static void main(String[] args) {

		// Jaggu order
		Pizza pizza = new CapsicumTopping(new CheeseTopping(new CheeseTopping(
				new CheeseTopping(new OnionsTopping(new TomatosTopping(new TomatosTopping(new ThinCrustPizaa())))))));

		System.out.println(pizza.prepare());

	}

}
