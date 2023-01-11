package com.wipro.ra20106511.multithreading.threadlifecycle;

public class MyChildThread extends Thread{
	@Override
	public void run() {
		System.out.println("Inside Child thread!");
		//now using child thread we can analyze states of parent thread. 
		
		try {
			Thread.sleep(1500);//child thread going to sleep for 1.5 sec State: Timed-Waiting
			//ParentThread state: WAITING 
			System.out.println("Thread # "+Main.t.getId() +" Thread State: "+ Main.t.getState() +" Thread Name: "+Main.t.getName() + " Thread Priority: "+Main.t.getPriority());
			
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		//child thread is waiting for parent thread to release the lock on synchronized code. 
		//BLOCK state
		MySynchronizedCode.myMethod();
		
	}

}
