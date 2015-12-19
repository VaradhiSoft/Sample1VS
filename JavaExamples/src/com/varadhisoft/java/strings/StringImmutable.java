package com.varadhisoft.java.strings;

public class StringImmutable {
      public static void main(String[] args) {
		
    	  String s1 = "abc";
    	  
    	  s1 = "abcd";
    	  
    	  String s2 = new String("123");
    	  
    	  s2 = "1234";
    	  
    	  s2 = new String("1234");
    	  
    	  
    	  
    	  String str = "";
    	  
    	  for(int i=0;i<10;i++){
    		  str+=i;                                //  "0"   "01"    "012"  "0123"   "0123....9"
    		  System.out.println(str);
    	  }
    	  
    	  System.out.println(str);  // "0123456789"
    	  
        StringBuffer strB = new StringBuffer("");
    	  
    	  for(int i=0;i<10;i++){
    		  strB.append(i);                                //     "0123....9"
    		  System.out.println(strB);
    	  }
    	  
    	  System.out.println(strB);  // "0123456789"
    	  
    	  
    	  
	}
}
