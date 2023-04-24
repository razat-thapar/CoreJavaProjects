package com.wipro.ra20106511.basics.collectionsframework.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnderstandingSortedSetMethods {

	public static void main(String[] args) {
		
		String[] countries = {"India","Austrailia","Britain","United States of America","Turkey","Afghanistan"};
		//### natural sorting order of String. i.e. lexicographically. 
		SortedSet<String> ss = new TreeSet<String>();
		for(String country: countries) {
			ss.add(country);
		}
		
		System.out.println(ss);
		
		//method 1
		System.out.println(ss.first());
		//method 2 
		System.out.println(ss.last());
		//method 3 
		System.out.println(ss.headSet("India"));
		//method 4 
		System.out.println(ss.tailSet("India"));
		//method 5 
		System.out.println(ss.subSet("Austrailia", "Turkey"));
		//method 6
		System.out.println(ss.comparator());
		
		//custom sorting order using SortedSet<E>
		System.out.println("Custom Sorting in descending order based on length");
		Comparator<String> desc_order_based_on_length = new Comparator<String>() {
			@Override
			public int compare(String s1,String s2) {
				int l1=s1.length();
				int l2 = s2.length(); 
				//return -1 , 1st argument. 
				//return 1 , 2nd argument.
				if(l1>l2) {
					return -1; 
				}else if(l2>l1) {
					return 1; 
				}else {
					return 0;
				}
				 
			}
		};
		SortedSet<String> ss2 = new TreeSet<String>(desc_order_based_on_length);
		for(String country: countries) {
			ss2.add(country);
		}
		System.out.println(ss2);
		System.out.println(ss2.comparator());
		
	}

}
