package com.varadhisoft.java.exceptionhandling;

class MyException extends RuntimeException {
	public MyException() {
	}
}

class A {
	
	void m1() throws InterruptedException, MyException {	
		 
		Thread.sleep(4000);

	}

	void m2() throws InterruptedException, ArithmeticException { // throws
																	// specification

	}
} //A

public class ThrowsEx {
	public static void m1(){
		System.out.println("m1");
	}
	public static void m1(int i){
		System.out.println("m1  "+i);
	}
	public static void main(String[] args) {
		System.out.println("Entered ThrowsEx main()");

		A a1 = new A();
		try {
			a1.m1();
		} /*catch (MyException e) {  // Optional since UNChecked

		} */catch (InterruptedException e) {

		}

		try {
			a1.m2();
		} catch (ArithmeticException e) { // optional
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Exited ThrowEx main()");
	}
}
