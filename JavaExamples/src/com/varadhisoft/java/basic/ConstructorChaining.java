package com.varadhisoft.java.basic;
class Student {
  private int rollno;
  private String name;
  private float marks;
    Student(int rollno,String name,float marks){   // 3 arg      
       this(rollno);       
       this.name = name;
        this.marks = marks;  
     }
    Student(){ // 0 arg
     System.out.println("Zero Arg Student Constructor is called");
    }

   Student(int rollno){  // 1 arg
     this();        
     System.out.println("One Arg Student Constructor is called");
     this.rollno = rollno;  
     this.displayStudentData();
    }
   void displayStudentData(){
       System.out.println("Roll no.:"+rollno);
       System.out.println("Name:"+name);
       System.out.println("Marks:"+marks);
    }  
}  // Student
public class ConstructorChaining{
   public static void main(String[] args){
      Student s1 = new Student(1,"NTR",76);
      s1.displayStudentData(); 

      Student s2 = new Student(2,"Arya",87);          
      s2.displayStudentData(); 
    }
}