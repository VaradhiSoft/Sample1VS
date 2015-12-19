package com.varadhisoft.java.examples3;

import com.varadhisoft.java.oops.Student;

public class StudentEx {
    public static void main(String[] args) {
		Student s1 = new Student(1001,"Ravi",76);
		s1.displayStudentDetails();
		System.out.println("---------------------------------------");
		
		Student s2 = new Student(1002,"Teja",87);
		s2.displayStudentDetails();
		System.out.println("---------------------------------------");
		
		Student s3 = new Student();		
		s3.displayStudentDetails();
		System.out.println("---------------------------------------");
		
		Student s4 = new Student(67.8f);
		
		
		
		
		s4.displayStudentDetails();
	}
}
