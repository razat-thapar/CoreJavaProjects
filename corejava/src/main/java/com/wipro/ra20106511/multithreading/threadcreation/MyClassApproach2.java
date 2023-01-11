package com.wipro.ra20106511.multithreading.threadcreation;

public class MyClassApproach2 implements Runnable {

	@Override
	public void run() {
		//some computation. 
		for(int i=0; i<100;i++) {
			System.out.println(Thread.currentThread().getId()+" i:"+i);
		}

	}

}
