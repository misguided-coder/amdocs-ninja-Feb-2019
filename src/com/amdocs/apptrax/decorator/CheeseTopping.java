package com.amdocs.apptrax.decorator;

public class CheeseTopping extends Pizza {

	Pizza pizza;
	
	public CheeseTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String prepare() {
		return pizza.prepare() + this.addCheese();
	}

	public String addCheese() {
		return " with Cheese";
	}

}
