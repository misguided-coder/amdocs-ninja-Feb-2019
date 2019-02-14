package com.amdocs.apptrax.memory;

public class CarTest {
 
	Car globalCar = null;
	
	public static void main(String[] args) {
		new CarTest();
	}
	
	public CarTest() {
		Car car = new Car(1000, "X6", "BMW", 8900000.00, 260);
		car.info();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedDown();
		globalCar = car;
		System.out.println("Done!!!!");
	}
}
