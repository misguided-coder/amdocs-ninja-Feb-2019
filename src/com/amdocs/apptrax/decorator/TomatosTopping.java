package com.amdocs.apptrax.decorator;

public class TomatosTopping extends Pizza {

	Pizza pizza;
	
	public TomatosTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String prepare() {
		return pizza.prepare() + this.addTomatos();
	}

	public String addTomatos() {
		return " with Tomatos";
	}

}
