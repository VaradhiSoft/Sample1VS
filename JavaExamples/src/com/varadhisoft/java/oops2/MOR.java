package com.varadhisoft.java.oops2;

class A{
	void m1(){
		System.out.println("A's m1()");
	}
}

class B extends A{
	void m1(){
		System.out.println("B's m1()");
	}
}

public class MOR {
	
	  public static void main(String[] args) {
		  A b1 = new B(); // Parent class reference can hold the object of child class
		  
		  b1.m1();  // Line 10
		  b1 = new A();
		  b1.m1();  // Line 4
	}

}
