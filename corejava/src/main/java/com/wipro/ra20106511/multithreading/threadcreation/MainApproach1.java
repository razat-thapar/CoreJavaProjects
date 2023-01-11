package com.wipro.ra20106511.multithreading.threadcreation;

public class MainApproach1 {

	public static void main(String[] args) {
		int no_of_threads=3;
		MyClassApproach1[] obj= new MyClassApproach1[no_of_threads];
		for(int i=0;i<no_of_threads;i++) {
			obj[i]	= new MyClassApproach1();
			obj[i].start();//This thread will invoke start() and JVM will call run() method automatically in another thread. 
		}
	}
  
}
