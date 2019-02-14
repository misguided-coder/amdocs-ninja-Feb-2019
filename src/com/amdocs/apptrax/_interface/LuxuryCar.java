package com.amdocs.apptrax._interface;

public class LuxuryCar extends Car  {

	@Override
	public void start() {
		System.out.println("LuxuryCar is started using voice command!!!!");
	}

	@Override
	public void speedUp() {
		System.out.println("LuxuryCar speed is going very high.....");
	}

}
