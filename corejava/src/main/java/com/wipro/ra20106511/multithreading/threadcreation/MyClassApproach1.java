package com.wipro.ra20106511.multithreading.threadcreation;

public class MyClassApproach1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println(Thread.currentThread().getId()+" i:"+i);
		}
	}

}
