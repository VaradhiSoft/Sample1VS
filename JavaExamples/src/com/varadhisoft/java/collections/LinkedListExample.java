package com.varadhisoft.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("David");
		ll.add("David");
		ll.add(30);  //  ll.add(new Integer(30));  Auto-boxing
		ll.add(null);
		ll.add("James");
		System.out.println(ll);
		ll.set(0,"Hello");  
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("August");
		System.out.println(ll);		
	}
}
