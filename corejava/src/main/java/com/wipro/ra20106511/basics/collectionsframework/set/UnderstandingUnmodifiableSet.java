package com.wipro.ra20106511.basics.collectionsframework.set;

import java.util.HashSet;
import java.util.Set;

public class UnderstandingUnmodifiableSet {

	public static void main(String[] args) {
		String[] names = {"Razat", "Garry", "Magoo","Sukhpreet","Anagh","Razat","Garry"};
		String[] names1 = {"Razat","Arshit","Anagh","Sidharth"};
		HashSet<String> hs = new HashSet<>(); 
		for(String name: names) {
			hs.add(name);
		}
		
		
		//unmodifiable set using varargs
		Set<String> immutableSet = Set.of(names1);
		System.out.println(immutableSet);
		//restricted operation. 
		try {
			immutableSet.clear();
		}catch(UnsupportedOperationException e) {
			System.out.println(e.getClass());
		}
		
		//unmodifiable set using collection class object
		Set<String> immutableSet2 = Set.copyOf(hs);
		System.out.println(immutableSet2);
		//restricted operation. 
		try {
			immutableSet2.clear();
		}catch(UnsupportedOperationException e) {
			System.out.println(e.getClass());
		}

	}

}
