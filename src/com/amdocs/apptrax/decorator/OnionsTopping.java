package com.amdocs.apptrax.decorator;

public class OnionsTopping extends Pizza {

	Pizza pizza;
	
	public OnionsTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String prepare() {
		return pizza.prepare() + this.addOnions();
	}

	public String addOnions() {
		return " with Onions";
	}

}
