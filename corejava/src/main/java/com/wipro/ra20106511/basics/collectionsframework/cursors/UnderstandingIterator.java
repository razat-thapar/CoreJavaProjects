package com.wipro.ra20106511.basics.collectionsframework.cursors;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UnderstandingIterator {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//add elements 
		for(int i=0; i<10; i++) {
			pq.add(i);
		}
		
		//reading elements 
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//removing elements
		System.out.println(pq);
		System.out.println("remove elements divisible by 3: ");
		//creating new iterator 
		Iterator<Integer> itr2 = pq.iterator(); 
		int temp;
		while(itr2.hasNext()) {
			temp=itr2.next();
			if(temp%2==0) {
				itr2.remove();
			}
		}
		System.out.println(pq);
	}

}
