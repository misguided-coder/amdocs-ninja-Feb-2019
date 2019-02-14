package com.amdocs.apptrax.identity;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + speed;
		result = prime * result + vin;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (speed != other.speed)
			return false;
		if (vin != other.vin)
			return false;
		return true;
	}
	
	
	
	
	
}
