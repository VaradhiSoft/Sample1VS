package com.varadhisoft.java.basic;

class Employee {

	int empno;
	String name;
	String designation;
	double salary;

	Employee(int empno, String name, String designation, double salary) {
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void giveData(int empno, String name, String designation,
			double salary) {
		this.empno = empno; // 1) to refer instance var
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void displayData() {
		System.out.println("Emp details:");
		System.out.println("EmpNo:" + empno);
		System.out.println("Emp Name:" + name);
		System.out.println("Emp Designation:" + designation);
		System.out.println("Emp Salary:" + salary);
	}
} // Employee

public class ExecEmp {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Arya", "SSE", 20000);
        e1.displayData();
        
        Employee e2 = new Employee(1002,"Surya","TL",40000);
        e2.displayData();
        
        
        e1.giveData(1001, "Arya", "TL", 35000);
        e1.displayData();
        
        //Employee e3 = new Employee();
        //e3.giveData(empno, name, designation, salary);
	}
}