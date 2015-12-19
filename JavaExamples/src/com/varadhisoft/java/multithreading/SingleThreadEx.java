package com.varadhisoft.java.multithreading;

class MyThread extends Thread {
	@Override
	public void run() {

		if (Thread.currentThread().getName().equals("FirstThread")) {
			for (int i = 1; i <= 30; i++)
				System.out.println("Thread1 :" + i);
		} else if (Thread.currentThread().getName().equals("SecondThread")) {

			for (int i = 31; i <= 60; i++)
				System.out.println("Thread2 :" + i);
		}

	}
}

public class SingleThreadEx {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread(); // t1 & t2 are in new state

		t1.setName("FirstThread");
		t2.setName("SecondThread");

		t1.start();
		t2.start(); // t1 & t2 are in active state

	}
}
