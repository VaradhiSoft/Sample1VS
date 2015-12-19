package com.varadhisoft.java.jdk5features;

import java.util.Scanner;

import com.varadhisoft.java.oops.Bike;
import com.varadhisoft.java.oops.Car;
import com.varadhisoft.java.oops.Vehicle;

abstract class Vehicle{
   abstract void move();
  } // Vehicle

class Car extends Vehicle{
   protected void move(){  // Overriding
       System.out.println("CAR is moving");
     }
 }  

class Bike extends Vehicle{
     void move(){
       System.out.println("BIKE is moving");
     }
 }  

class AbstractEx{
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.println(" Pls select a vehicle Car/Bike:");
       String v = s.next();

        Vehicle vehicle = null;

       if(v.equals("car"))
           vehicle = new Car();
       else
          vehicle = new Bike();
       vehicle.move();     

   }

 }

