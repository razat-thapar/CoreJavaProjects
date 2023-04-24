package com.wipro.ra20106511.basics.collectionsframework.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class UnderstandingNavigableSetMethods {

	public static void main(String[] args) {
		String[] countries = {"India","Austrailia","Britain","United States of America","Turkey","Afghanistan"};
		NavigableSet<String> ns = new TreeSet<String>(); 
		for(String country : countries) {
			ns.add(country);
		}
		
		System.out.println(ns);
		
		//method 1
		System.out.println(ns.ceiling("India"));
		//method 2
		System.out.println(ns.floor("India"));
		//method 3 
		System.out.println(ns.higher("India"));
		//method 4 
		System.out.println(ns.lower("India"));
		//method 5 
		System.out.println(ns.pollFirst());
		//method 6
		System.out.println(ns.pollLast());
		System.out.println(ns);
		//method 7
		NavigableSet<String> ns_reverse = ns.descendingSet();
		System.out.println(ns_reverse);
		
		//on numerical data. 
		Integer[] scores = {23,46,98,100,24,8,2,32,231};
		NavigableSet<Integer> ns2 = new TreeSet<Integer>(); 
		for(Integer score : scores) {
			ns2.add(score);
		}
		
		System.out.println(ns2);
		
		//method 1
		System.out.println(ns2.ceiling(30));
		//method 2
		System.out.println(ns2.floor(21));
		//method 3 
		System.out.println(ns2.higher(98));
		//method 4 
		System.out.println(ns2.lower(24));
		//method 5 
		System.out.println(ns2.pollFirst());
		//method 6
		System.out.println(ns2.pollLast());
		System.out.println(ns2);
		//method 7
		NavigableSet<Integer> ns2_reverse = ns2.descendingSet();
		System.out.println(ns2_reverse);

	}

}
