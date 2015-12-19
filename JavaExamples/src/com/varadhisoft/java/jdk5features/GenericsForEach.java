package com.varadhisoft.java.jdk5features;

import java.util.ArrayList;
import java.util.List;

public class GenericsForEach {

	public static void main(String[] args) {
      Student s1 = new Student(1001,"Rama"); // obj creation     MDCB
      Student s2 = new Student(1002,"Sita");
      
      List studList = new ArrayList();  // No Type Safety
      
      studList.add(s1);  // store
      studList.add(s2);
            
      Student s3 = (Student)studList.get(0);  //  retrieval
      s3.displayStudentDetails();  // Rama
      
      Student s4 = (Student)studList.get(1);
      s4.displayStudentDetails();  // Sita
      
      Employee e1 = new Employee(1003,6000);
      Employee e2 = new Employee(1004, 8000);
      
      studList.add(e1);
      studList.add("Hi");
      studList.add(36);    // Auto boxing  JDK1.5+

      List<Employee> empList = new ArrayList<Employee>();  // Type Safety  with Generics   JDK1.5+
      empList.add(e1);
      empList.add(e2);
         //  empList.add(s1);     
      for(Employee emp:empList){      // For Each  or Enhanced For loop   JDK1.5+
    	  emp.displayDetails();    	  
      }
	}
}

class Employee{
	int eno;
	double salary;
	Employee(int eno,double salary){
		this.eno = eno;
		this.salary = salary;
	}
	void displayDetails(){
		System.out.println(eno+":"+salary);
	}
}
class Student {
		
	int rno;
	String name;
	float marks;
	
   static int count;
	
	  public Student(){
		   System.out.println(" 0 arg constructor");
		   
		   
		   count++;
	   }
	   
	 public   Student(float marks){
	    	this.marks = marks;
	    	System.out.println(" 1 arg constructor");
	    	count++;
	    }
	 public  Student(int rno, String name) {
			this.rno = rno;
			this.name = name;
		    System.out.println(" 2 arg constructor");
		    count++;
		}
	public  Student(int rno, String name, float marks) {
			this.rno = rno;
			this.marks = marks;
			this.name = name;
		    System.out.println(" 3 arg constructor");
		    count++;
		}
	
	 
	  
	void giveDataToStudent(int rno, String name, float marks) {

		this.rno = rno;
		this.name = name;
		this.marks = marks;

	}

	public void displayStudentDetails() {

		System.out.println("Student Rollno:" + rno);
		System.out.println("Student Name:" + name);
		System.out.println("StudentMarks:" + marks);
		
		System.out.println("Total:"+count);
	}
	
	
	
}
