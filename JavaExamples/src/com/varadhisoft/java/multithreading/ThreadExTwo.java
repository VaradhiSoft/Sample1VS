package com.varadhisoft.java.multithreading;


public class ThreadExTwo {
	public static void main(String[] args) {
		MyThreadOne t1 = new MyThreadOne();   
		MyThreadTwo t2 = new MyThreadTwo();   // t1 & t2 are in new state
			
		t1.setName("FirstThread");
		t2.setName("SecondThread");
			
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(Thread.MIN_PRIORITY);
	
		System.out.println(Thread.currentThread().getName());	
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
				
		//t1.start();
		//t2.start();    // t1 & t2 are in active state
		
		
		
		
		
         
	}
}
