package com.varadhisoft.java.multithreading2;

class MyThreadOne implements  Runnable { //1
	@Override
	public void run() {
		for(int i=1;i<=30;i++)
		 System.out.println("Thread1 :"+i);
	}
}
class MyThreadTwo implements  Runnable {
	@Override
	public void run() {
		for(int i=31;i<=60;i++)	
		 System.out.println("Thread2 :"+i);
	}
}

public class RunnableThreadEx {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThreadOne());   
		Thread t2 = new Thread(new MyThreadTwo());   // t1 & t2 are in new state
			
	
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
				
		t1.start();
		t2.start();    // t1 & t2 are in active state
		
		
		
		
		
         
	}
}
