package com.varadhisoft.java.jdk5features;

import static java.lang.Integer.*; // all the static members(var & methods) of Integer class are made available
import static java.lang.System.out; // only one static member is made available
class StaticImports {
  public static void main(String[] args){
     out.println(MAX_VALUE);
     out.println(toHexString(11));
     out.println(parseInt("1001"));
     StaticImports si = new StaticImports();  // Object methods
     System.out.println(si.getClass());
     System.out.println(si.toString());
     System.out.println(si.hashCode());
         
   }
       
}
