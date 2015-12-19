package com.varadhisoft.java.collections;

import java.util.Enumeration;
import java.util.HashMap;

import com.varadhisoft.java.common.Student;

public class MapGenericExample {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap(); // type safety
        hm.put("1001","Naresh");
        hm.put("1002","Suresh");
        
        //hm.put("1003", new Student());
        
       String s1= (String)hm.get("1001");
       System.out.println(s1);
       
       String s2= (String)hm.get("1002");
       System.out.println(s2);
       
      for(String s:hm.keySet()){  // Foreach / enhanced for
    	    System.out.println(hm.get(s));
      }
	}
}
