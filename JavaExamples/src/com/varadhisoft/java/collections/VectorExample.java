package com.varadhisoft.java.collections;

import java.util.Enumeration;
import java.util.Vector;

import com.varadhisoft.java.common.Employee;
import com.varadhisoft.java.common.Student;

public class VectorExample {
 Integer k;
 Double df;
	public static void main(String[] args) {
           
       Vector v = new Vector(2);     // JDK1.0 
       
       System.out.println(v.capacity());  //2
       System.out.println(v.size());      // 0
       
       Student s1 = new Student(1001,"NNN",87.0f);
       v.add(s1);
       Student s2 = new Student(1002,"SSSS",76.0f);
       v.add(s2);
       
       v.add(null);
       
       Employee e1 = new Employee();
       e1.giveData(4001, "EEEE", "Sr. Programmer", 50000);
       
       v.add(e1);
       v.add("Seenu");
 
       System.out.println(v.capacity());
       System.out.println(v.size());
       
	}
}