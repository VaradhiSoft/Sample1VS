package com.varadhisoft.java.fileio;


import java.io.*;

class FileReading {
	public static void main(String[] args) throws IOException {
		// Step 1
		FileReader fr = new FileReader(args[0]);  // Filename from Cmd Line Arg
		// Step 2
		int a = fr.read(); // returns ASCII code
		int count =1;
		while (a != -1) {
			System.out.print((char) a);
			a = fr.read();
			count++;
		}
		//Step 3
		fr.close();
		System.out.println(count);
	}
}
