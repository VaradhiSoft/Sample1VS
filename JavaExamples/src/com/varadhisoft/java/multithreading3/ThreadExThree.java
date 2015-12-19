package com.varadhisoft.java.multithreading3;
	
import java.lang.Thread;

class MyThread extends Thread {
	
	public void run() {   // body of the thread
		System.out.println(Thread.currentThread().getName());
	 if("First".equals(Thread.currentThread().getName())){	
		for(int i=1;i<=30;i++)
		 System.out.println("Thread1 :"+i);
	 }else if(Thread.currentThread().getName().equals("Second")){
		for(int i=31;i<=60;i++)
			 System.out.println("Thread2 :"+i);
	 }
	}
} // MyThread

public class ThreadExThree {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program started"); 
		System.out.println("Name :"+Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();   
		MyThread t2 = new MyThread();   // t1 & t2 are in new state
			
		t1.setName("First");
		t2.setName("Second");
		
		t1.start();
		t2.start();    // t1 & t2 are in active state
		
		System.out.println("T1 ->"+t1.getPriority());
		System.out.println("T2 ->"+t2.getPriority());
		
		t1.join();
		t2.join();  // main thread will be in blocked state till t1 & 2 are finished
		
		System.out.println("Program finished"); 
         
	}
} 

   //  java ThreadEx
