package com.varadhisoft.java.basic1;

class Employee {

	int empno;
	String name;
	String designation;
	double salary;        // instance --  per instance(object) one copy

	static int count;     // static/class ----  per class one copy
	static int totalSalary;

	void giveData(int empno, String name, String designation, double salary) {
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		count++;
		totalSalary += salary; // totalSalary = totalSalry + salary;
	}

	void displayData() {   // instance
		System.out.println("Emp details:");
		System.out.println("EmpNo:" + empno);
		System.out.println("Emp Name:" + name);
		System.out.println("Emp Designation:" + designation);
		System.out.println("Emp Salary:" + salary);
		System.out.println("Total No. of Emp " + count);
		System.out.println("Total Emp Salary:" + totalSalary);
	}

	static void displayCountAndTotalSalary(){  // static method
	 System.out.println("Total No. of Emp "+count);
	 System.out.println("Total Emp Salary:"+totalSalary);
	 }

}

public class ExecuteEmployeeCountStatic {

	public static void main(String[] args) {

		Employee.displayCountAndTotalSalary();
		
		Employee emp = new Employee();
		emp.giveData(1001, "Suresh", "SE", 5000);
		emp.displayData();

		Employee.displayCountAndTotalSalary();

		Employee emp2 = new Employee();
		emp2.giveData(1002, "Naresh", "SSE", 6000);
		emp2.displayData();

		Employee.displayCountAndTotalSalary();

	}
}