package com.varadhisoft.java.examples4;

class Person{
   private String name;
   private byte age;

  public void giveDataToPerson(String name, byte age){
     this.name = name;
     this.age = age; 
   }
  
  public  void displayPersonDetails(){
      System.out.println(name+":"+age);
    }
}  // Person


class Student extends Person{
   private int rollno;
   private float marks;

  public void giveDataToStudent(String name, byte age,int rollno, float marks){
     giveDataToPerson(name,age);
     this.rollno = rollno;
     this.marks = marks; 
   }
  
   public void displayStudentDetails(){
      super.displayPersonDetails();
      System.out.println(rollno+":"+marks);
    }
 } // Student



class Employee extends Person{
   private int empno;
   private double salary;

 public void giveDataToEmployee(String name, byte age,int empno, double salary){
     giveDataToPerson(name,age);
     this.empno = empno;
     this.salary = salary; 
   }
  
   public void displayEmployeeDetails(){
      super.displayPersonDetails();
      System.out.println(empno+":"+salary);
    }
}  // Employee

public class Inheritance{

    public static void main(String[] args){
          
        Student s1 = new Student();
        s1.giveDataToStudent("XYZ",(byte)21,1001,78.5f);

        Employee e1 = new Employee();
        e1.giveDataToEmployee("ABC",(byte)35,8001,4000);

       System.out.println("Stude details:");
       s1.displayStudentDetails();
       System.out.println("---------------------");
       System.out.println("Emp Details:");
       e1.displayEmployeeDetails();



     }
}
  