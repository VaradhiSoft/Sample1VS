package com.varadhisoft.java.oops1;

import java.util.Scanner;

abstract class Vehicle {

	abstract void move();
	
	void consumFuel(){
		 System.out.println("Consume Diesel");
	}
	 Vehicle(){
		 //
	 }

} // Vehicle

class Car extends Vehicle {
	final double MIN_THRESHOLD_VALUE = 3.14;
	public void move() { // Overriding
		System.out.println("CAR is moving at 100KMPH");

	}
	
	Car(){
		super();
	}

}

class Bike extends Vehicle {
	protected void move() { // Overriding
		System.out.println("Bike is moving at 60KMPH");

	}
	
	void consumFuel(){
		 System.out.println("Consume petrol");
	}

	
}

public class MethodOverriding {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Pls select a vehicle Car/Bike:");
		String v = s.next();

		Vehicle vehicle = null;

		if (v.equals("car"))
			vehicle = new Car();
		else
			vehicle = new Bike();

		vehicle.move();

	}

}