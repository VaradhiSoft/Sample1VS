package com.varadhisoft.java.oops;

public class ExHandling {
	
	 public static void main(String[] args) {
		System.out.println("Line 1");
		
		System.out.println("Line 2");
		
		try{
			
			System.out.println("Line 3");
			System.out.println("Line 4"+(8/0));
		}
		catch(Exception e){
			System.out.println("Div by 0 happened");
		}
		System.out.println("Line 6");
	}

}
