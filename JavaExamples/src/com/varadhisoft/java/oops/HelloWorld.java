package com.varadhisoft.java.oops;
class A{
	int i;
	int j;
	A(){
			
	}
	void m2(){
		
	}
}

class B extends A{
	int i;
	int k;
	
	B(){
	  super();  // A() line 7	
		
	}
	
	void m1(int i, int m){
		 i =30;   // m1's i
		 this.i = 20; //  B's i
		 super.i = 10;  //  A's i
		 j = 40;  //  A's j
		 k = 60;  //  B's k
		 m = 80;  //  m1's m
		 m2();  // B's m2()
		 this.m2();  // B's m2()    same as above..... rarely used
		 super.m2();  // A's m2()
	}
	
	 void m2(){
		 B b1 = new B();
	 }
}

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       System.out.println("Hello World");
       
       
       
       
	}

}
