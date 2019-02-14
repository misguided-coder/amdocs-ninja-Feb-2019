package com.amdocs.apptrax.decorator;

public class ThinCrustPizaa extends Pizza {
	
	@Override
	public String prepare() {
		return super.prepare() + " with thin crust base";
	}
}
