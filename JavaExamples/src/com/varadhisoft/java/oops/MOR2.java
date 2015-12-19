package com.varadhisoft.java.oops;

import java.io.IOException;
import java.sql.SQLException;

class A1{
	public void m1() throws IOException, ClassNotFoundException, IndexOutOfBoundsException{    // overridden
		System.out.println("In A's m1");
	}
}

class B1 extends A1{
	public void m1() throws IOException, ArithmeticException, NullPointerException{   // overriding
		System.out.println("in B's m1");
	}
}
// Overriding method should not have a new checked exception in its throws clause than that of overridden method 

public class MOR2 {
  public static void main(String[] args) {
	  
	  
	
}
}

// Checked  -- Exception and all its child classes except the RuntimeException

// Unchecked -- RuntimeException and its child classes


  