package com.varadhisoft.java.oops;

import java.util.Scanner;

abstract class Vehicle {
	
	abstract void move();

	abstract void addFuel();

	Vehicle(){
		System.out.println("Vehicle's cons");
	}
	
	void speed() { // concrete
		System.out.println(" Vehicle is at 50kmph speed");
	}
}

class Car extends Vehicle {  // is-a
	  Car(){
		 super(); 
	  }
	void move() {
		System.out.println("CAR is moving");
	}

	void addFuel() {
		System.out.println(" Disiel is added");
	}

	void speed() {
		System.out.println(" Car is at 100kmph speed");
	}
} // Car

class Bike extends Vehicle {
	
	void move() {
		System.out.println("BIKE is moving");
	}

	void addFuel() {
		System.out.println(" Petrol is added");
	}
} // Bike

public class Abstract {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Pls select a vehicle Car/Bike:");
		String v = s.next();

		Vehicle vehicle = null;

		if (v.equals("car"))
			vehicle = new Car();
		else
			vehicle = new Bike();

		vehicle.addFuel();
		vehicle.move();
		vehicle.speed();
	}
}