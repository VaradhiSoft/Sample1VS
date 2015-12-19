package com.varadhisoft.java.collections;

import java.util.Enumeration;
import java.util.Vector;

import com.varadhisoft.java.common.Employee;
import com.varadhisoft.java.common.Student;

public class VectorGenericExample {
 Integer k;
 Double df;
	public static void main(String[] args) {
           
       Vector<Student> v = new Vector<Student>(2);     // JDK1.5+  type safety  
       
       System.out.println(v.capacity());
       System.out.println(v.size());
       
       Student s1 = new Student(1001,"NNN",87.0f);
       v.add(s1);
       Student s2 = new Student(1002,"SSSS",76.0f);
       v.add(s2);
       
            
       System.out.println(v.capacity());
       System.out.println(v.size());
       
      for(Student s:v){                   // Enhanced for loop OR for each loop   JDK1.5
    	  s.displayStudentDetails();
      }
       
       
	}  // main
} // VectorExample


