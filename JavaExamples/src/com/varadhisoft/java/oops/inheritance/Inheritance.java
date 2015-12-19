package com.varadhisoft.java.oops.inheritance;

class Person{
	  private String name;
	  private byte age; 
	  // DOB, Father name, Address, tel, email, emergency contact person, blood group, etc

	  void giveDataToPerson(String name, byte age){
	     this.name = name;
	     this.age = age; 
	   }
	  
	   void displayPersonDetails(){
	      System.out.print(name+":"+age + ":");
	    }
	   void m1(){}
} // Person

class Student extends Person{     //  inheritance     is-a 
	   private int rollno;
	   private float marks;

	  void giveDataToStudent(String name, byte age,int rollno, float marks){
	     giveDataToPerson(name,age);   // Line 7
	     this.rollno = rollno;
	     this.marks = marks; 
	   }
	  
	   void displayStudentDetails(){
	      displayPersonDetails();   // Line 13
	      System.out.println(rollno+":"+marks);
	      super.m1(); // Line 16
	      m1(); //Line 34
	    }
	   void m1(){
		   
	   }
} // Student

class Employee extends Person{
	   private int empno;
	   private double salary;

	  void giveDataToEmployee(String name, byte age,int empno, double salary){
	     giveDataToPerson(name,age);   // Line 7
	     this.empno = empno;
	     this.salary = salary; 
	   }
	  
	   void displayEmployeeDetails(){
	      displayPersonDetails();  // Line 12
	      System.out.println(empno+":"+salary);
	    }
	}  // Employee

	public class Inheritance{

	    public static void main(String[] args){
	          
	        Student s1 = new Student();
	        s1.giveDataToStudent("XYZ",(byte)21,1001,78.5f);

	        Employee e1 = new Employee();
	        e1.giveDataToEmployee("ABC",(byte)35,8001,4000.00); // Line 38

	       s1.displayStudentDetails();  // Line 28
	       e1.displayEmployeeDetails(); // Line 44
	     }
	}
	// Any decimal number in Java is treated as double
	// Nay non-decimal number is treated as integer
	  
