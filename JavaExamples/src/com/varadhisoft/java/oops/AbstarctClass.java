package com.varadhisoft.java.oops;

abstract class A{
	 abstract void m1();
	 
	   void getUpAt5AM(){
		   System.out.println("Do Yoga");
	   }
	 
}

  class B extends A{
	  void m1(){
		  System.out.println("B's m1()");
	  }
}
  
  class C extends A{
	  void m1(){
		  System.out.println("C's m1()");
	  }
	  void getUpAt5AM(){
		  System.out.println("Jogging");
	  }
	  
  }

public class AbstarctClass {
    public static void main(String[] args) {
    	 A b1 = new B();
    	 b1.m1();
    	 b1.getUpAt5AM();
    	 b1 = new C();
    	 b1.m1();
    	 b1.getUpAt5AM();
    	
    }
}
