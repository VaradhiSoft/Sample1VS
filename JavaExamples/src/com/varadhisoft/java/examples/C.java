package com.varadhisoft.java.examples;

public class C {
	int i;
	/*C(int i){
		this.i = i;
	}*/
	void print(){
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		C c1 = new C(100); // Not OK
		c1.print();
		C c2 = new C(); // OK
	}
}

// L11-> L12 --> L5 (10--> i) --> L6 (local L5-->instance L4) 
// L7 --> L13 --> L8 --> L9 (instance L4)  --> L14 
// Compiler inserts a 0 arg constructor ONLY when no other constructor is present