package com.varadhisoft.java.examples;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Entered main()");
		
		int a = 10;  // hardcoded
		int b = 0;
		try {
			// Doubtful code			
			int c = a / b;
			System.out.println("Result:" + c);

		}
		
		catch(ArithmeticException e) {
			// Remedy code
			System.out.println("AE Exception occured");
		}
		catch(NullPointerException e){
			System.out.println("NPE occurred");
		}
		catch(Exception e){
			System.out.println("Ex occurred");
		}finally{
			System.out.println("Finally");
		}
		
		System.out.println("Exited main()");
	}
}
