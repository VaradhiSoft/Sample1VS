package com.varadhisoft.java.multithreading2;

import java.util.concurrent.Callable;

class MyCallableThreadOne implements  Callable<Object> {

	public Object call() {
		for(int i=1;i<=30;i++)
		 System.out.println("Thread1 :"+i);
		return null;
	}
}
class MyCallableThreadTwo implements  Callable<Object> {
	public Object call() {
		for(int i=31;i<=60;i++)
		 System.out.println("Thread2 :"+i);
		return null;
	}
}

public class CallableThreadEx {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThreadOne());   
		Thread t2 = new Thread(new MyThreadTwo());   // t1 & t2 are in new state
			
	
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
				
		t1.start();
		t2.start();    // t1 & t2 are in active state
		
		
		
		
		
         
	}
}
