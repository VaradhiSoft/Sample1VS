package com.varadhisoft.java.exceptionhandling;


public class ExHandling {

	public static void main(String[] args) {
		System.out.println("Program execution started");

		try {
			int a = Integer.parseInt(args[0]);   // "30" -> 30
			int b = Integer.parseInt(args[1]);
			int c = a / b; // JVM thrown AE
			System.out.println("Result=" + c);
			//System.exit(0);
			return ;

		} catch (NumberFormatException  e) {
			System.out.println("Only digits please");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println(" Second no. can't be 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter Both numbers");
		} catch (Exception e) {
			System.out.println("Some error occurred");
		}
	  	finally{
	  		 // guaranteed execution expect on exit  
	  		// Resource releasing code    file/db/n/w
	  		 // connections closing
	  	}
		System.out.println("Program execution finished");
	}
}