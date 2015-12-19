package com.varadhisoft.java.basic;

class SB{

     static{
        System.out.println("Inside static block of SB");
     }

     SB(){
        System.out.println("Inside SB constructor");
      }
  }

public class SBExec{
     static{
        System.out.println("Inside static block of SBExec");
     }
     public static void main(String[] args){
        System.out.println("Inside main");
         SB sb1 = new SB();
         SB sb2 = new SB();
         SB sb3 = new SB();
      }
 }