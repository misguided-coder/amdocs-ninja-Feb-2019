package com.amdocs.apptrax.decorator;

public class CapsicumTopping extends Pizza {

	Pizza pizza;
	
	public CapsicumTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String prepare() {
		return pizza.prepare() + this.addCapsicums();
	}

	public String addCapsicums() {
		return " with Capsicums";
	}

}
