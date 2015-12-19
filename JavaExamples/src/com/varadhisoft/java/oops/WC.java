package com.varadhisoft.java.oops;

public class WC {
	public static void main(String[] args) {
          int i = 10;
          
          Integer iObj = new Integer(i);  // wrapping
          
          System.out.println(iObj.intValue()); // unwrapping
          
          boolean b = true;
          
          Boolean bObj = new Boolean(b);
          
          boolean b2 = bObj.booleanValue();
          
          System.out.println(b2);
          
          char c = 'S';
          
          Character cObj = new Character(c);
          
          System.out.println(cObj.charValue());
          
          
		
		
	}
}
