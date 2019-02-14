package com.amdocs.apptrax._interface;

public class Main {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Racer racer = new Racer();
		Mechanic mechanic = new Mechanic();
		HouseKeeper houseKeeper = new HouseKeeper();
		
		driver.drive(new Car());
		driver.drive(new Bus());
		driver.drive(new Erikshaw());
		driver.drive(new LuxuryCar());
	
		System.out.println("======================");
		racer.startRace(new Car());
		racer.startRace(new LuxuryCar());

		System.out.println("======================");
		mechanic.repair(new Bus());

		System.out.println("======================");
		houseKeeper.cleanVehicle(new Car());
	}
}
