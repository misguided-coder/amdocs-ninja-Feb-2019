package com.amdocs.apptrax._interface;

public class Bus extends Vehicle implements Brakable, Repairable {

	@Override
	public void start() {
		System.out.println("Bus is started using key!!!!");
	}

	@Override
	public void speedDown() {
		System.out.println("Bus speed is slowing down.....");

	}

	@Override
	public void doRepair() {
		System.out.println("Bus repairing is going on.....");
	}

}
