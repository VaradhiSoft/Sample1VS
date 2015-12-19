package com.varadhisoft.java.exceptionhandling;

public class ThrowExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		if(b == 0)
			  throw new ArithmeticException();  // throw
		
		
		int c = a/b;
		
		System.out.println(c);
		
		
		

	}

}
