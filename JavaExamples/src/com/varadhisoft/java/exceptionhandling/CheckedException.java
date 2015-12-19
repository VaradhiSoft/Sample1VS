package com.varadhisoft.java.exceptionhandling;

public class CheckedException {
	
	public static void main(String[] args) {
		
		System.out.println(" Entered main()");
		
		
		
			try {
				Thread.sleep(10*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   // IE is checked exception
		
		
		//int b= 5/0;
		
		System.out.println("Finished main()");
		
	}

}
