package com.varadhisoft.java.common;

public class Employee {
	   
	   int empno;
	   String name;
	   String designation;
	   double salary;

	   static int count;
	   static int totalSalary;

	  public void giveData( int empno,   String name,   String designation,  double salary){
	     this.empno = empno;
	     this.name  = name;
	     this.designation = designation ;
	     this.salary = salary ;
	     count++;
	     totalSalary+= salary;
	   } 

	 public  void displayData(){
	    System.out.println("Emp details:");
	    System.out.println("EmpNo:"+empno);
	    System.out.println("Emp Name:"+name);
	    System.out.println("Emp Designation:"+designation);
	    System.out.println("Emp Salary:"+salary);
	   // System.out.println("Total No. of Emp "+count);
	    //System.out.println("Total Emp Salary:"+totalSalary);
	   }

	   static void displayCountAndTotalSalary(){
	       System.out.println("Total No. of Emp "+count);
	      System.out.println("Total Emp Salary:"+totalSalary);
	   }
	      
	}

