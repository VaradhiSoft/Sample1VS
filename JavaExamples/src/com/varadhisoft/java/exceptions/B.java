package com.varadhisoft.java.exceptions;

import java.rmi.Remote;
import java.util.HashMap;

class A  {
	public void process() {
		System.out.println("A");
	}
}

public class B extends A {
	public void process() throws RuntimeException {
		super.process();
		HashMap m;
		
		Object o;
		
		if (true)
			throw new RuntimeException();
		System.out.println("B");
	}

	public static void main(String[] args) {
		try {
			((A) new B()).process();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
