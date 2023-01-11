package com.wipro.ra20106511.multithreading.threadlifecycle;

public class Main {
	public static Thread t; 

	public static void main(String[] args) {
		
		System.out.println("Inside Main Thread!");
		
		//main method thread meta data 
		Thread mt = Thread.currentThread();
		System.out.println("Thread # "+mt.getId() +" Thread State: "+ mt.getState() +" Thread Name: "+mt.getName() + " Thread Priority: "+mt.getPriority());
		
		//creating parent thread. 
		//NEW
		MyParentThread pt = new MyParentThread();
		Main.t=pt;
		pt.setName("Parent Thread");
		System.out.println("Thread # "+pt.getId() +" Thread State: "+ pt.getState() +" Thread Name: "+pt.getName() + " Thread Priority: "+pt.getPriority());
		
		//RUNNABLE
		pt.start();
		System.out.println("Thread # "+pt.getId() +" Thread State: "+ pt.getState() +" Thread Name: "+pt.getName() + " Thread Priority: "+pt.getPriority());
		
		try {
			pt.join();//main thread waits forever for pt thread to die. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Parent thread died
		//TERMINATED
		System.out.println("Thread # "+pt.getId() +" Thread State: "+ pt.getState() +" Thread Name: "+pt.getName() + " Thread Priority: "+pt.getPriority());
		
		System.out.println("Thread # "+mt.getId() +" Thread State: "+ mt.getState() +" Thread Name: "+mt.getName() + " Thread Priority: "+mt.getPriority());
		
	}

}
