package com.varadhisoft.java.oops;

class Person {
	private String name;
	byte age;
	
	int i;
	int j;
	//Person(){}
	Person(String name, byte age) {
		System.out.println(" Person constructor");
		this.name = name;
		this.age = age;
	}

	void displayPersonDetails() {
		System.out.print(name + ":" + age +":");
	}
} // Person
class Student extends Person {
	
	int rollno;
	float marks;
    int i;  
	Student(String name, byte age, int rollno, float marks) {
	    super(name, age); // calling parent class constructor from child class constructor
		this.rollno = rollno;
		this.marks = marks;
		System.out.println("Student constructor");
        i = 40;  // L23
       super.i = 40; // L7
        j= 55; // L8    super.j = 55;
	}

	void displayStudentDetails() {
		super.displayPersonDetails();
		System.out.println(rollno + ":" + marks);
	}
	void displayPersonDetails(){
	}
	
} // Student

class Employee extends Person {
	int empno;
	double salary;

	Employee(String name, byte age, int empno, double salary) {
		super(name, age);
		this.empno = empno;
		this.salary = salary;
		System.out.println("Emp constructor");
	}

	void displayEmployeeDetails() {
		super.displayPersonDetails();
		System.out.println(empno + ":" + salary);
	}
} // Employee

public class Super {

	public static void main(String[] args) {

		Student s1 = new Student("XYZ-Stud", (byte) 22, 1001, 78.5f);

		Employee e1 = new Employee("ABC-Emp", (byte) 35, 8001, 4000);

		s1.displayStudentDetails();
		e1.displayEmployeeDetails();

	}
}
// Some constructor of parent must be executed before executing the child class constructor