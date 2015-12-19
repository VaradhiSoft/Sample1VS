package com.varadhisoft.java.multithreading;
	
import java.lang.Thread;

class MyThreadOne extends Thread {
	
	public void run() {   // body of the thread
		for(int i=1;i<=30;i++)
		 System.out.println("Thread1 :"+i);
	}
} // MyThreadOne

class MyThreadTwo extends Thread {
	@Override
	public void run() {
		for(int i=31;i<=60;i++)
		 System.out.println("Thread2 :"+i);
	}
}  //MyThreadTwo

public class ThreadEx {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program started"); 
		MyThreadOne t1 = new MyThreadOne();   
		MyThreadTwo t2 = new MyThreadTwo();   // t1 & t2 are in new state
			
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("T1 ->"+t1.getPriority());
		System.out.println("T2 ->"+t2.getPriority());
		
		t1.start();
		t2.start();    // t1 & t2 are in active state
		
		
		
		t1.join();
		t2.join();  // main thread will be in blocked state till t1 & t2 are finished
		
		System.out.println("Program finished"); 
         
	}
} 

   //  java ThreadEx
