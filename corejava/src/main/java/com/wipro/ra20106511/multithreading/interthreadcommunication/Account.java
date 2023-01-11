package com.wipro.ra20106511.multithreading.interthreadcommunication;

public class Account {
	private double balance; 
	private AccountType type = AccountType.SAVING ;//default is saving 
	public static enum AccountType{
		SAVING,
		CURRENT
	}
	//setting of account metadata can only happen at creation 
	public Account(double openingbalance,AccountType t) {
		this.balance=openingbalance;
		this.type=t;
		System.out.println(this.type +" Account Opened with opening balance : INR "+this.balance);
	}
	
	public double getBalance() {
		return this.balance;
	}
	public AccountType getType() {
		return this.type;
	}
	
	//withdraw 
	//only one thread can access this at a time.
	public synchronized void withdraw(double amount ) {
		if(this.balance<amount) {
			System.out.println("Insufficient Balance! Please wait for deposit...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance -= amount; 
		System.out.println("INR "+amount + " successfully withdrawed , available balance: INR "+this.balance);
	}
	//deposit
	//only one thread at a time can access this. 
	public synchronized void deposit(double amount) {
		System.out.println("Depositing INR "+amount+" please wait...");
		this.balance += amount;
		System.out.println("INR "+amount+" successfully deposited , available balance: INR "+this.balance);
		//this.notify();
		this.notifyAll();
	}
}
