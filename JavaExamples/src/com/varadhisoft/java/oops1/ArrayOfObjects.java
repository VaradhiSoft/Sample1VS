package com.varadhisoft.java.oops1;

import java.util.Scanner;

class Employee {
   
  private int empno;
  private  String name;
  private String designation;
  private double salary;
  
  Scanner s = new Scanner(System.in);

   Employee(){
     System.out.println("Enter Emp details:");
  
     empno = s.nextInt();
     name  = s.next();
     designation = s.next();
     salary = s.nextDouble();
   } 

   void displayData(){
    System.out.println("Emp details:");
    System.out.println("EmpNo:"+empno);
    System.out.println("Emp Name:"+name);
    System.out.println("Emp Designation:"+designation);
    System.out.println("Emp Salary:"+salary);
    System.out.println("-----------------------------------");
   }

}  // Employee

public class ArrayOfObjects{

   public static void main(String[] args){
     
     Employee empArr[] = new Employee[100000];  

     for(int i=0; i<empArr.length;i++)
         empArr[i] = new Employee();
     

     for(int i=0; i<empArr.length;i++)
          empArr[i].displayData();  

   }
  }