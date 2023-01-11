package com.wipro.ra20106511.multithreading.threadsynchronization;

public class MainUnsynchronizedMethodExample {

	public static void main(String[] args) {
		//object without any lock implementation 
		MyUnsynchronizedMethodClass obj = new MyUnsynchronizedMethodClass();
		//create threads. 
		Thread t1 = new Thread(() -> {
			obj.incrementCounter(5);
			MyUnsynchronizedMethodClass.decrementSecondCounter(5);
			obj.incrementThirdCounter(5);
		});
		Thread t2 = new Thread(() -> {
			obj.incrementCounter(4);
			MyUnsynchronizedMethodClass.decrementSecondCounter(4);
			obj.incrementThirdCounter(4);
		});
		Thread t3 = new Thread(() -> {
			obj.incrementCounter(3);
			MyUnsynchronizedMethodClass.decrementSecondCounter(3);
			obj.incrementThirdCounter(3);
		});
		Thread t4 = new Thread(() -> {
			obj.incrementCounter(2);
			MyUnsynchronizedMethodClass.decrementSecondCounter(2);
			obj.incrementThirdCounter(2);
		});
		Thread t5 = new Thread(() -> {
			obj.incrementCounter(1);
			MyUnsynchronizedMethodClass.decrementSecondCounter(1);
			obj.incrementThirdCounter(1);
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		//ensuring that main thread runs the below code once t1 and t2 are dead.
		//displaying the value of count 
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Value of count is : "+obj.getCount());
		System.out.println("Value of secondcount is : "+MyUnsynchronizedMethodClass.getSecondCount());
		System.out.println("Value of thirdcount is : "+obj.getThirdCount());
	}

}
