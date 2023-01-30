package com.wipro.ra20106511.basics.collectionsframework.list;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class UnderstandingLinkedList {

	public static void main(String[] args) {
		//#######creation
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<String> ll2 = new LinkedList<String>(); 
		//List<Integer> ll3 = new LinkedList<Integer>(Collection<? extends E> c) ;
		
//		#########Adding element to List/ Add element
		for(int i=0;i<10;i++) {
			ll.add(i); //Autoboxing of int to Integer
		}
		System.out.println(ll);
		//#######adding at specific index 
		ll.add(0,23);
		System.out.println(ll);
		
//		#########Changing elements/ Set element
		for(int i=1 ; i<ll.size();i+=2) {
			ll.set(i, 2*i);
		}
		System.out.println(ll);
		
//		#########Removing elements/Delete element 
		//removing using index
		ll.remove(3);
		//removing an object
		ll.remove(Integer.valueOf(18));
		System.out.println(ll);
		
//		Iterating elements 
		Iterator<Integer> itr = ll.iterator();
		System.out.println("Iterating elements using iterator(): ");
		while(itr.hasNext()) {
			System.out.print(itr.next() +",");
		}
		
		System.out.println("\nIterating elements using for each loop");
		for(int i : ll) {
			System.out.print(i +",");
		}
		
//		get elements
		System.out.println("\nGet vllue at index 4");
		System.out.println(ll.get(4));
		
//		Sorting elements
		//without using comparator 
		Collections.sort(ll);
		System.out.println(ll);
		
		//using comparator for custom order in object other than numbers.
		ll2.add("aaa");
		ll2.add("aa");
		ll2.add("a");
		ll2.add("aaaa");
		Collections.sort(ll2, new Comparator<String>() {
			@Override
			public int compare(String i1 , String i2) {
				return i2.length() - i1.length();
			}
		});
		System.out.println(ll2);
//		LinkedList size
		System.out.println("Size of linkedList is: "+ll.size());
		
		//special methods of linkedList 
		System.out.println("Special Methods in Linked List");
		System.out.println(ll);
		System.out.println("//getFirst , getLast");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println("//addFirst , addLast");
		ll.addFirst(100);
		ll.addLast(999);
		System.out.println(ll);
		System.out.println("//removeFirst , removeLast");
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

	}

}
