package com.amdocs.apptrax.decorator;

public class CheeseBasePizaa extends Pizza {
	
	@Override
	public String prepare() {
		return super.prepare() + " with cheese brust base";
	}
}
