package com.varadhisoft.java.jdk5features;

import java.io.Serializable;

class VarArgs implements Serializable{     // JDK1.5+
	
	public static void main(String[] args){
	        int sum = add(1,2);
	        System.out.println("Sum:"+sum);
	        sum = add(1,2,3);
	        System.out.println("Sum:"+sum);
	        sum = add(1,2,3,4);
	        System.out.println("Sum:"+sum);
	        sum = add(1,2,3,4,5);
	        System.out.println("Sum:"+sum);
	        sum = add(1,2,3,4,5,6,7,8,9,10);
	        System.out.println("Sum:"+sum);
	   }
	
	   
	 static int add(int... numbers){     // ... ellipsis
	     int sum = 0;
	   for(int i:numbers)
	       sum+=i;
	     return sum;
	}	  
}
// 1.We can't have more than 1 ellipsis in a single method
// 2. Ellipsis should be last parameter