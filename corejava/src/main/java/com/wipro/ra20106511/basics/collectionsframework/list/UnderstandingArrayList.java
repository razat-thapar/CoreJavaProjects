package com.wipro.ra20106511.basics.collectionsframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class UnderstandingArrayList {

	public static void main(String[] args) {
		
		//#######creation
		List<Integer> al = new ArrayList<Integer>();
		List<String> al2 = new ArrayList<String>(20); 
		//List<Integer> al3 = new ArrayList<Integer>(Collection<? extends E> c) ;
		
//		#########Adding element to List/ Add element
		for(int i=0;i<10;i++) {
			al.add(i); //Autoboxing of int to Integer
		}
		System.out.println(al);
		//#######adding at specific index 
		al.add(0,23);
		System.out.println(al);
		
//		#########Changing elements/ Set element
		for(int i=1 ; i<al.size();i+=2) {
			al.set(i, 2*i);
		}
		System.out.println(al);
		
//		#########Removing elements/Delete element 
		//removing using index
		al.remove(3);
		//removing an object
		al.remove(Integer.valueOf(18));
		System.out.println(al);
		
//		Iterating elements 
		Iterator<Integer> itr = al.iterator();
		System.out.println("Iterating elements using iterator(): ");
		while(itr.hasNext()) {
			System.out.print(itr.next() +",");
		}
		
		System.out.println("\nIterating elements using for each loop");
		for(int i : al) {
			System.out.print(i +",");
		}
		
//		get elements
		System.out.println("\nGet value at index 4");
		System.out.println(al.get(4));
		
//		Sorting elements
		//without using comparator 
		Collections.sort(al);
		System.out.println(al);
		
		//using comparator for custom order in object other than numbers.
		al2.add("aaa");
		al2.add("aa");
		al2.add("a");
		al2.add("aaaa");
		Collections.sort(al2, new Comparator<String>() {
			@Override
			public int compare(String i1 , String i2) {
				return i2.length() - i1.length();
			}
		});
		System.out.println(al2);
//		ArrayList size
		System.out.println("Size of arrayList is: "+al.size());
		

	}

}
