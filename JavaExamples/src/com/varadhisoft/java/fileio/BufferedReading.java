package com.varadhisoft.java.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReading {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int count = 1;
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
			count++;
		}
		//fr.close();
		br.close();
		System.out.println(count);
	}
}
