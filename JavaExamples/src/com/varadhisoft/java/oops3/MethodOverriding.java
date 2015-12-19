package com.varadhisoft.java.oops3;

import java.util.Scanner;

class Vehicle {
	void move() { // Overridden
		System.out.println("Vehicle is moving at 40KMPH");
	}

} // Vehicle

class Car extends Vehicle {
	final double MIN_THRESHOLD_VALUE = 3.14;
	/*protected void move() { // Overriding
		System.out.println("CAR is moving at 100KMPH");
	}*/
}

class Bike extends Vehicle {	
	/*void move(){
		System.out.println("Bike is moving at 60KMPH");
	}*/
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