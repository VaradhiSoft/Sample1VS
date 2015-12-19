package com.varadhisoft.java.designpatterns.singleton;

 enum EnumSingleton {
	
	INSTANCE;

}


public class EasySingleton {
public static void main(String[] args) {
	EnumSingleton e1= EnumSingleton.INSTANCE;
	System.out.println(e1);
}
}
