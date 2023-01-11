package com.wipro.ra20106511.multithreading.threadcreation;

public class MainApproach2 {

	public static void main(String[] args) {
		int no_of_threads = 3; 
		Thread[] t = new Thread[no_of_threads];
		for(int i=0; i<no_of_threads;i++) {
			t[i]= new Thread(new MyClassApproach1());
			t[i].start();
		}
		
		//below threads are useful in case our run method implementation is simple.   
		
		//another thread using anonymous class object 
		Thread t4 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Inside anonymous class object thread!");
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t4.start();
		
		
		
		//another thread using lambda expression
		Thread t5 = new Thread(() -> {
			System.out.println("Inside lambda expression thread!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t5.start();
	}

}
