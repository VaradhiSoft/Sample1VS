package com.varadhisoft.java.oops;

interface Shape {
    double PI = 3.14;
    double area(double d);  // Executive double room  ... spec
 }

class Square implements Shape{  // Hotel 1
 public double area(double d){  // service impl
    return d*d;
  }
}

class Circle implements Shape{   // Hotel 2
 public double area(double d){   // service iml
    return PI*d*d;
  }
}

class InterfaceExample{

  public static void main(String[] args){   // You
          Shape s = new Square();  // H1
          System.out.println(" Area of Square:"+s.area(4.0));

          s = new Circle();  // H2

          System.out.println(" Area of circle:"+s.area(4.0));

  }

}


