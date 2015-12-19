package com.varadhisoft.java.fileio;

import java.io.*;
class Account implements Serializable {
	int accno;
	double balance;
	transient String pin;

	Account(int accno, double balance, String pin) {
		this.accno = accno;
		this.balance = balance;
		this.pin = pin;
	}

	void displayAccountDetails() {
		System.out.println("Accno:" + accno + ":" + "Balnce:" + balance + ":"
				+ "Pin:" + pin);
	}
} // Account

public class SerDe {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Account acc1 = new Account(1002, 20000, "1234");
		FileOutputStream fos = new FileOutputStream("D:\\account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc1);  // Serialization
		oos.close();
		
		FileInputStream fis = new FileInputStream("D:\\account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account acc2 = (Account) ois.readObject();  // Deserialization
		acc2.displayAccountDetails();
		ois.close();
	}
}
