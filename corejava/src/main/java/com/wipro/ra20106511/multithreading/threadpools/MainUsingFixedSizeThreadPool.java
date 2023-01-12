package com.wipro.ra20106511.multithreading.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainUsingFixedSizeThreadPool {

	public static void main(String[] args) {
		//create a thread pool of size=no of cores in cpu
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		//create 10 tasks
		Task[] t = new Task[10];
		for(int i=0;i<10;i++) {
			t[i] = new Task(i);
			//execute the task.
			executorService.execute(t[i]);
		}
		
		//main thread will do below tasks. 
		
		//shutdown the threadPool so that no new tasks are accepted.
		executorService.shutdown();
		
		//checking if all threads are terminated. 
		long startTime = System.currentTimeMillis();
		while(!executorService.isTerminated()) {
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time to end all the tasks is : "+ (endTime-startTime));
		
		//checking if shutdown is completed. 
		if(executorService.isShutdown()) {
			System.out.println("Shutdown completed!");
		}
		

	}

}
