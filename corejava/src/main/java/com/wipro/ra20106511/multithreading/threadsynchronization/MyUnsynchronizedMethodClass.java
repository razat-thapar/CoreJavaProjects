package com.wipro.ra20106511.multithreading.threadsynchronization;

public class MyUnsynchronizedMethodClass {
	private int count=0; 
	private static int second_count=0;
	private int third_count=0; 
	public void incrementCounter(int n) {
		//adding some delay as per n milliseconds time. 
		try {
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.count++;
		System.out.println("Thread # "+Thread.currentThread().getId()+ " Incremented count value by 1");
	}
	
	public static void decrementSecondCounter(int n) {
		//adding some delay as per n milliseconds time. 
		try {
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		MyUnsynchronizedMethodClass.second_count--;
		System.out.println("Thread # "+Thread.currentThread().getId()+ " Decremented secondcount value by 1");		
		
	}
	
	public void incrementThirdCounter(int n) {
		//adding some delay as per n milliseconds time. 
		try {
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		this.third_count++;
		System.out.println("Thread # "+Thread.currentThread().getId()+ " Incremented thirdcount value by 1");
		
	}
	
	
	public int getCount() {
		return this.count; 
	}
	
	public static int getSecondCount() {
		return MyUnsynchronizedMethodClass.second_count;
	}
	
	public int getThirdCount() {
		return this.third_count;
	}
}

