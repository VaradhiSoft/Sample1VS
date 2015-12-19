package com.varadhisoft.java.common;

public class Student {
		
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
