package com.wipro.ra20106511.multithreading.interthreadcommunication;

public class Bank {

	public static void main(String[] args) {
		//account open 
		Account a1 = new Account(1_00_000.0,Account.AccountType.SAVING);
		
		//Thread requests. 
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				a1.withdraw(1_50_000.0);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				a1.deposit(1_00_000.0);
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				a1.withdraw(2_00_000.0);
			}
		});
		
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				a1.deposit(1_50_000.0);
			}
		});
		
		
		//execution order. 
		t1.start();
		t2.start();
		t3.start();
		
		//some amount will be deposited after 10 sec. 
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t4.start();
		
		

	}

}
