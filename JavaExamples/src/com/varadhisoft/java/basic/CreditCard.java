package com.varadhisoft.java.basic;

class CC {
	int balance;

	CC() {

	}

	public CC(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class CreditCard {
	public static void main(String[] args) {
		CC cc1 = new CC();
		cc1.setBalance(500);

		CC cc2 = new CC(500);
	}
}
