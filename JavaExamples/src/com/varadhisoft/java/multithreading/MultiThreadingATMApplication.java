package com.varadhisoft.java.multithreading;

class Account{
  	private int accno;
  	private float balance;
  	 
  	 Account(int accno, float balance){
  		 this.accno = accno;
  		 this.balance = balance;
  	 }

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	void withdraw(float amount){
		System.out.println("Trying to get the balance of A/C:"+accno);
		System.out.println("Balance of A/C no "+accno+" is Rs."+getBalance());
		System.out.println("Trying to withdraw Rs."+amount+" from A/C "+accno);
		float bal = getBalance();
		if(bal>=amount){
			bal-=amount; //bal=bal-amount;
			setBalance(bal);
			System.out.println(" Hello "+accno+", Please collect Rs."+amount);
		}else{
			System.out.println("Cannot process the request of "+accno+". Insufficient funds.");
		}
		System.out.println("Withdrawl operation of A/C "+accno+" is completed.");
	} // withdraw
  	 
} // Account

class AccountThread extends Thread{
	Account account;
	float amount;
	AccountThread(Account account, float amount){
		this.account = account;
		this.amount = amount;
	}
	public void run(){
		account.withdraw(amount);
	}
} // AccountThread

public class MultiThreadingATMApplication {

	public static void main(String[] args) throws InterruptedException {
		   Account a1 = new Account(1001,7000);
		   Account a2 = new Account(1002, 5000);
		   
		   AccountThread t1 = new AccountThread(a1,2000);
		   AccountThread t2 = new AccountThread(a2,6000);
		   
		   
		   t1.start();
		   t2.start();
		   
		   
		   t1.join();  // main thread will wait
		   t2.join();  // till t1 & t2 are finished
		   
		   
		   System.out.println(" After withdrwal balance in first account is Rs."+a1.getBalance()); // 5000
		   
		   System.out.println(" After withdrwal balance in second account is Rs."+a2.getBalance()); // 0
		   
	}
}
