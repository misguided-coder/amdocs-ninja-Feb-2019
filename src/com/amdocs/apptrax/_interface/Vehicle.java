package com.amdocs.apptrax._interface;

public abstract class Vehicle implements Automobile {

	@Override
	public void stop() {
		System.out.println("Vehicle stopped!!!!");
	}
	
}
