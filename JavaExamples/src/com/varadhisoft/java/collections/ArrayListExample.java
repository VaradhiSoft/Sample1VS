package com.varadhisoft.java.collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Shreyas Chinna
 *
 */
public class ArrayListExample {
	/*
	  This is 
	   main()
	    method
	 */
	public static void main(String[] args) {
		List list = new ArrayList(3);    // initial capacity
		System.out.println(list.size());   //    0 
		list.add("hello");               
		list.add(new Integer(40));
		list.add(null);
		System.out.println(list);// overridden toString() method of ArrayList class is called.   Object & JDK 1.5
		System.out.println(list.size());  // 3
		list.add(1,70); // Auto-boxing    JDK 1.5+     primitive -> WC
		System.out.println(list.size());  // 4
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		int n = (Integer)list.get(2); // Auto-unboxing   JDK1.5+   WC -> primitive
		System.out.println("Retrieved value:"+n);
		System.out.println(list.contains(41));
		list.clear();
		System.out.println("ArrayList size:"+list.size());
		
		list = Collections.synchronizedList(list);
		
		System.out.println(list);
		
	} // main

} // ArrayListExample
