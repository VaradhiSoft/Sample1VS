package com.varadhisoft.java.multithreading.synchronzation;

class Account{
  	 int accno;
  	 float balance;
  	 
  	 Account(int accno, float balance){
  		 this.accno = accno;
  		 this.balance = balance;
  	 }
//Varadhi
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	 void withdraw(float amount) {
		System.out.println("Trying to get the balance of A/C:"+accno);
		System.out.println("Balance of A/C no "+accno+" is Rs."+getBalance());
		System.out.println("Trying to withdraw Rs."+amount+" from A/C "+accno);
		synchronized(this){  
		float bal = getBalance();
		
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e){			
		}
		// block level
		  // lib method call	
		if(bal>=amount){
			bal-=amount; //bal=bal-amount;
			setBalance(bal);
			System.out.println(" Hello "+accno+", Please collect Rs."+amount);
		}else{
			System.out.println("Cannot process the request of "+accno+". Insufficient funds.");
		}
		}
		System.out.println("Withdrawl operation of A/C "+accno+" is completed.");
	}
  	 
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
public class SynchronizationApplication {

	public static void main(String[] args) throws InterruptedException {
		   Account a1 = new Account(1001,7000);
		   
		   AccountThread t1 = new AccountThread(a1,4000);
		   AccountThread t2 = new AccountThread(a1,4000);
		   
		   
		   t1.start();
		   t2.start();
		   
		   
		   t1.join();  // main thread will wait
		   t2.join();  // till t1 & t2 are finished
		   
		   
		   System.out.println(" After withdrwal balance in account is Rs."+a1.getBalance());  // 2000
		   
		   //System.out.println(" After withdrwal balance in second account is Rs."+a2.getBalance()); // 0
		   
	}
}
