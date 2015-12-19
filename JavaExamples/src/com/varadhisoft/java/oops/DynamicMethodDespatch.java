package com.varadhisoft.java.oops;

import java.util.Scanner;

class Vehicle {
	void move() {
		System.out.println("Vehicle is moving");
	}
} // Vehicle

 class Car extends Vehicle {
	final double PI = 3.14;   //  1
	void move() {
		System.out.println("CAR is moving");
		
		// PI = 4.56;
	}
}  // Car

class Bike extends Vehicle {
	void move(){
	 System.out.println("BIKE is moving");
  }
}  //  Bike

public class DynamicMethodDespatch{
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