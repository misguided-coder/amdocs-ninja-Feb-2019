package com.amdocs.apptrax._interface;

public class Car extends Vehicle implements Acceleratable,Brakable,Washable {

	@Override
	public void start() {
		System.out.println("Car is started using key!!!!");
	}

	@Override
	public void doWash() {
		System.out.println("Car washing is going on.....");
	}

	@Override
	public void speedDown() {
		System.out.println("Car speed is slowing down.....");
		
	}

	@Override
	public void speedUp() {
		System.out.println("Car speed is going up.....");
	}

}
