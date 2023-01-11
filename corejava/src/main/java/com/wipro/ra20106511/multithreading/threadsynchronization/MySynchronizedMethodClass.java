package com.wipro.ra20106511.multithreading.threadsynchronization;

public class MySynchronizedMethodClass {
	private int count=0; 
	private static int second_count=0;
	private int third_count=0; 
	
	//synchronized method
	public synchronized void incrementCounter(int n) {
		//adding some delay as per n milliseconds time. 
		try {
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.count++;
		System.out.println("Thread # "+Thread.currentThread().getId()+ " Incremented count value by 1");
	}
	
	//static synchronized method
	public synchronized static void decrementSecondCounter(int n) {
		//adding some delay as per n milliseconds time. 
		try {
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		MySynchronizedMethodClass.second_count--;
		System.out.println("Thread # "+Thread.currentThread().getId()+ " Decremented secondcount value by 1");		
		
	}
	
	
	//synchronized block 
	public void incrementThirdCounter(int n) {
		//adding some delay as per n milliseconds time. 
		try {
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		synchronized(this) {
		this.third_count++;
		System.out.println("Thread # "+Thread.currentThread().getId()+ " Incremented thirdcount value by 1");
		}
	}
	
	
	public int getCount() {
		return this.count; 
	}
	
	public static int getSecondCount() {
		return MySynchronizedMethodClass.second_count;
	}
	
	public int getThirdCount() {
		return this.third_count;
	}
}
