package com.wipro.ra20106511.multithreading.threadlifecycle;

public class MyParentThread extends Thread{ 
	public static Thread t; 
	
	@Override 
	public void run() {
		System.out.println("Inside Parent Thread!");		
		
		//create a child thread. 
		//NEW
		MyChildThread ct = new MyChildThread();
		MyParentThread.t=ct; 
		ct.setName("Child Thread");
		System.out.println("Thread # "+ct.getId() +" Thread State: "+ ct.getState() +" Thread Name: "+ct.getName() + " Thread Priority: "+ct.getPriority());
		
		//RUNNABLE
		ct.start();
		System.out.println("Thread # "+ct.getId() +" Thread State: "+ ct.getState() +" Thread Name: "+ct.getName() + " Thread Priority: "+ct.getPriority());
		
		try {
			Thread.sleep(1000);//parent thread going to sleep for 1 sec i.e. TIMED_WAITING 
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		//Child Thread state should be still TIMED_WAITING as sleep time is 1.5 sec. 
		System.out.println("Thread # "+ct.getId() +" Thread State: "+ ct.getState() +" Thread Name: "+ct.getName() + " Thread Priority: "+ct.getPriority());
		
		//synchronized code access 
		MySynchronizedCode.myMethod();//Parent thread is executing this while child thread is waiting for this synchronized code as well now. 
		
		
		//Parent thread will wait for the child thread to die. 
		//child thread's run method will help us to show the state of parent thread now. 
		try {
			ct.join();//parent thread waits forever for child thread to die. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//here child thread died 
		//TERMINATED
		System.out.println("Thread # "+ct.getId() +" Thread State: "+ ct.getState() +" Thread Name: "+ct.getName() + " Thread Priority: "+ct.getPriority());
	}
}
