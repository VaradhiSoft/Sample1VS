package com.varadhisoft.java.oops;

 public  class StaticBlock{

     static
     {
        System.out.println("Inside static block");
               
     }


     StaticBlock(){
        System.out.println("Inside constructor");
      }

      public static void main(String[] args){
        System.out.println("Inside main");
        
        StaticBlock sb = new StaticBlock();

      }

  }