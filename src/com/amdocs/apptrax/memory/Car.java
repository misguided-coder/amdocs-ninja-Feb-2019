package com.amdocs.apptrax.memory;

public class Car {

	int vin;
	String model;
	String make;
	double price;
	int speed;

	public Car(int vin, String model, String make, double price, int speed) {
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
		this.speed = speed;
	}

	public void info() {
		System.out.printf("VIN : %s%n",this.vin);
		System.out.printf("MODEL : %s%n",this.model);
		System.out.printf("MAKE : %s%n",this.make);
		System.out.printf("PRICE : %s%n",this.price);
		System.out.printf("SPEED : %s%n",this.speed);
	}

	public void speedUp() {
		this.speed = this.speed + 10;
		System.out.printf("Car is speeding up and running at the speed of %d miles per hr.%n", this.speed);
	}

	public void speedDown() {
		this.speed = this.speed - 10;
		System.out.printf("Car is speeding down and running at the speed of %d miles per hr.%n", this.speed);
	}

}
