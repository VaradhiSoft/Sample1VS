package com.varadhisoft.java.oops;


abstract class A{
   int i;  // default
  A() { }
  void x(){

  }

}

 interface I{

   int i = 78;  // public , static, final
   void x(); // public, abstract    
   void y();
 }
 
 abstract class B2 implements I{
	public void x(){
		 
	 }
	 
 }
