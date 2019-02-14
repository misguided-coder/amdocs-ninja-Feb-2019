package com.amdocs.apptrax.identity;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car(1000, "Q7", "Audi", 12000000.00, 300);
		//Car car2 = new Car(1001, "Q5", "Audi", 10000000.00, 250);
		Car car2 = new Car(1000, "Q7", "Audi", 12000000.00, 300);
		
		//object identity comparsion
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		//object comparasion approach
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
	}
}
