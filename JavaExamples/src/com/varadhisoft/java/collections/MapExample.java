package com.varadhisoft.java.collections;

import java.util.Enumeration;
import java.util.HashMap;

import com.varadhisoft.java.common.Student;

public class MapExample {

	public static void main(String[] args) {
		HashMap ht = new HashMap();  
        ht.put("1001","Naresh");
        ht.put("1002","Suresh");
        ht.put(null, "Diwali");
        
        ht.put("1003", new Student());
        
       String s1= (String)ht.get("1001");
       //System.out.println(s1);
       
       String s2= (String)ht.get("1002");
       //System.out.println(s2);
	}
}
