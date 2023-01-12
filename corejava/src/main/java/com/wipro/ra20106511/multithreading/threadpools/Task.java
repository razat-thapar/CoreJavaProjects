package com.wipro.ra20106511.multithreading.threadpools;

public class Task implements Runnable{
	private int id; 
	public Task(int id) {
		this.id=id; 
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " :  Start : Task# "+this.id);
		try {
			Thread.sleep(2000);//simulating some operation taking 2 sec. 
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Thread.currentThread().getName() + " :  End : Task# "+this.id);
	}

}
