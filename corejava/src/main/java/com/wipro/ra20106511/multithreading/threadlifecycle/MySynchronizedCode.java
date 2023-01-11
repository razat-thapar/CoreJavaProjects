package com.wipro.ra20106511.multithreading.threadlifecycle;

public class MySynchronizedCode {
	//i don't want multiple threads to access this resource and make my DB inconsistent. 
	synchronized public static void myMethod() {
		//some computations related to DB transaction.
		System.out.println("Thread # "+Thread.currentThread().getId() + " entered synchronized method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		//child thread state
		Thread ct = MyParentThread.t;
		System.out.println("Thread # "+ct.getId() +" Thread State: "+ ct.getState() +" Thread Name: "+ct.getName() + " Thread Priority: "+ct.getPriority());
		System.out.println("Thread # "+Thread.currentThread().getId() + " is existing synchronized method");
	}
}
