package com.varadhisoft.java.exceptions7;

interface I1 {

}

interface I2 {

}

interface I3 extends I1, I2 {

}

class C1 extends C2 implements I1, I2, I3 { // multiple type inheritance

}

public class C2 {
	public static void main(String[] args) {
          int c = 8/0;           // ArithmeticException  
          System.out.println(c);
	}
}

class C3 extends C1 {

}