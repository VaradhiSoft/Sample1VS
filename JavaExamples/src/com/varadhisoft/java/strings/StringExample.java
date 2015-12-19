package com.varadhisoft.java.strings;

import java.lang.*;
public class StringExample {
	
	 public static void main(String[] args) {
		String s1 = new String("abc");
		
		String s2 = new String("abc");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1.equals(s2) :"+s1.equals(s2));    // true    check contents
		
	    String s3 = "abc";   // String pool
	    
	    String s4 = "abc";  // String pool
	    
	    System.out.println(s3);
	    System.out.println(s4);
	    System.out.println("s3.equals(s4) :"+s3.equals(s4));  // true
	    
	    System.out.println("s1.equals(s3) :"+s1.equals(s3));  // true
	    
	    System.out.println("s1==s2 :"+(s1==s2));   // false      
	    System.out.println("s1==s3 :"+(s1==s3));  //   false
	    System.out.println("s3==s4 :"+(s3==s4));  //  true
	    
	    
	    // equals --> contents
	    // ==   --> hashcode
	    
	    // new  -->  heap
	    // ""   ---> String pool
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		 
	}
}

