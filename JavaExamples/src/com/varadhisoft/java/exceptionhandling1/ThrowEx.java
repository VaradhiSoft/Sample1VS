package com.varadhisoft.java.exceptionhandling1;

class B{
	void m2(){
		try{
		  int c = 8 / 0; // JVM throws AE
		 System.out.println("C=" + c);
		}catch(ArithmeticException e){
			//throw e; // L20
			throw new RuntimeException(); // L20
		}
	}
} //B
class A {
	void m1() {
		System.out.println("Entered A's m1()");
		try {
			// B b1 = new B();
			  //b1.m2();
			 new B().m2(); //  L4,  L21/L24
		} catch (ArithmeticException e) {
			System.out.println(" caught and Thrown from A's m1() ");
			throw e; // rethrow
		}catch(RuntimeException e){
			throw e;  // rethrowing    L40
		}
		System.out.println("Exited A's m1()");
	}
} //A
public class ThrowEx {
	public static void main(String[] args) {
		System.out.println("Entered ThrowEx main()");
		A a1 = new A();
		try {
			a1.m1(); // L15    L36/L39
		} catch (ArithmeticException e) {
			System.out.println(" Caught in ThrowEx main()");
		}
		catch(RuntimeException e){
			System.out.println("Handled in main");
		}
		System.out.println("Exited ThrowEx main()");
	}
}
