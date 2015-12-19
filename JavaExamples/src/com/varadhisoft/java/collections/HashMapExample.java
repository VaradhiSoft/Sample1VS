package com.varadhisoft.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;

import com.varadhisoft.java.common.Student;

public class HashMapExample {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();   // 1.0
        ht.put("1001","Naresh");
        ht.put("1002","Suresh");
        ht.put(null, "Diwali");
        
        ht.put("1003", new Student());
        
       String s1= (String)ht.get("1001");
       //System.out.println(s1);
       
       String s2= (String)ht.get("1002");
       //System.out.println(s2);
       
       Enumeration e = ht.elements();
       
       while(e.hasMoreElements()){
    	   Object o = e.nextElement();
    	   if(o instanceof String)     	   
    	        System.out.println((String)o);
    	   if (o instanceof Student) {
			Student s = (Student) o;
			s.displayStudentDetails();
		}
       }
	}
}
