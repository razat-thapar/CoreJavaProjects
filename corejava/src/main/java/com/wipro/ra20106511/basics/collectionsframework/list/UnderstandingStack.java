package com.wipro.ra20106511.basics.collectionsframework.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

public class UnderstandingStack {

	public static void main(String[] args) {
		//#######creation
		Stack<Integer> s = new Stack<Integer>();
		Stack<String> s2 = new Stack<String>(); 
		//List<Integer> s3 = new Stack<Integer>(Collection<? extends E> c) ;
		
//		#########Adding element to List/ Add element
		for(int i=0;i<10;i++) {
			s.push(i); //Autoboxing of int to Integer
		}
		System.out.println(s);
		//#######adding at specific index 
		s.add(0, 23);
		System.out.println(s);
		
//		#########Changing elements/ Set element
		for(int i=1 ; i<s.size();i+=2) {
			s.set(i, 2*i);
		}
		System.out.println(s);
		
//		#########Remosing elements/Delete element 
		//remosing using index
		s.remove(3);
		//remosing an object
		s.remove(Integer.valueOf(18));
		//using pop method to remove the last element added. 
		s.pop();
		System.out.println(s);
		
//		Iterating elements 
		Iterator<Integer> itr = s.iterator();
		System.out.println("Iterating elements using iterator(): ");
		while(itr.hasNext()) {
			System.out.print(itr.next() +",");
		}
		
		System.out.println("\nIterating elements using for each loop");
		for(int i : s) {
			System.out.print(i +",");
		}
		
//		get elements
		System.out.println("\nGet value at index 4");
		System.out.println(s.get(4));
		
//		Sorting elements
		//without using comparator 
		Collections.sort(s);
		System.out.println(s);
		
		//using comparator for custom order in object other than numbers.
		s2.add("aaa");
		s2.add("aa");
		s2.add("a");
		s2.add("aaaa");
		Collections.sort(s2, new Comparator<String>() {
			@Override
			public int compare(String i1 , String i2) {
				return i2.length() - i1.length();
			}
		});
		System.out.println(s2);
//		Stack size
		System.out.println("Size of Stack is: "+s.size());
		
		


	}

}
