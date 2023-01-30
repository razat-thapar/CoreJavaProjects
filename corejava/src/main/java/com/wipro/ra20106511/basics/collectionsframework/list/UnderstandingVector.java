package com.wipro.ra20106511.basics.collectionsframework.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class UnderstandingVector {

	public static void main(String[] args) {
		//#######creation
		Vector<Integer> v = new Vector<Integer>();
		Vector<String> v2 = new Vector<String>(); 
		//List<Integer> v3 = new Vector<Integer>(Collection<? extends E> c) ;
		
//		#########Adding element to List/ Add element
		for(int i=0;i<10;i++) {
			v.add(i); //Autoboxing of int to Integer
		}
		System.out.println(v);
		//#######adding at specific index 
		v.add(0,23);
		System.out.println(v);
		
//		#########Changing elements/ Set element
		for(int i=1 ; i<v.size();i+=2) {
			v.set(i, 2*i);
		}
		System.out.println(v);
		
//		#########Removing elements/Delete element 
		//removing using index
		v.remove(3);
		//removing an object
		v.remove(Integer.valueOf(18));
		System.out.println(v);
		
//		Iterating elements 
		Iterator<Integer> itr = v.iterator();
		System.out.println("Iterating elements using iterator(): ");
		while(itr.hasNext()) {
			System.out.print(itr.next() +",");
		}
		
		System.out.println("\nIterating elements using for each loop");
		for(int i : v) {
			System.out.print(i +",");
		}
		
//		get elements
		System.out.println("\nGet vllue at index 4");
		System.out.println(v.get(4));
		
//		Sorting elements
		//without using comparator 
		Collections.sort(v);
		System.out.println(v);
		
		//using comparator for custom order in object other than numbers.
		v2.add("aaa");
		v2.add("aa");
		v2.add("a");
		v2.add("aaaa");
		Collections.sort(v2, new Comparator<String>() {
			@Override
			public int compare(String i1 , String i2) {
				return i2.length() - i1.length();
			}
		});
		System.out.println(v2);
//		Vector size
		System.out.println("Size of Vector is: "+v.size());
		
		

	}

}
