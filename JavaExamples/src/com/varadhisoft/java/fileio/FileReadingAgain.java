package com.varadhisoft.java.fileio;

import java.io.FileInputStream;
import java.io.IOException;

class FileReadingAgain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(args[0]);
			int c = fis.read();
			while (c != -1) {
				System.out.print((char) c);
				c = fis.read();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
			}
		} // finally
	} // main
} // FRA
