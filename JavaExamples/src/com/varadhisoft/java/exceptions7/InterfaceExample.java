package com.varadhisoft.java.exceptions7;
//J2EE
  interface Shape {   // menu
    double PI = 3.14; // public, static, final
    double area(double d); // poori

  } // Shape

  //apache.jar
class Square implements Shape{   // Annapurna
 public double area(double d){
     return d*d;
   }
}

//ibm.jar
class Circle implements Shape{  // Pournami
  public double area(double r){
     return PI*r*r;
   }
}

// some.jar
class Cylinder implements Shape{  // Some new hotel
	  public double area(double r){
	     return PI*r*r*r;
	   }
	}

class AB extends Square implements I1,I2  {
	
}

public class InterfaceExample{  // Customer
   public static void main(String[] args){
	      Shape s = new Square();  // Annapurna
           System.out.println(" Area of Square:"+s.area(4.0)); // poori

           s = new Circle();  // Pournami

           System.out.println(" Area of circle:"+s.area(4.0)); // poori
       // program to interface rather than implementation
           
           s= new Cylinder();  // new hotel
           System.out.println(s.area(6.9)); // poori
   }

}
// Program to interfaces rather than implementation

 interface I7{ }
 interface I8{ }
 interface I9{ }
 interface I10 extends I7,I8,I9{  // multiple type inheritance 
	 
	 
 }
 

  

  class  University{
    	
    //	 Department d;
    }

  
  
   class  Engine {
	  
  }
  
  class Vehicle {
	  Engine e;  // has-a
  } 
  
  class Car extends Vehicle {  // is-a
	  
  } 
  
     
  
  
