package com.wipro.ra20106511.basics.collectionsframework.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnderstandingHashSet {

	public static void main(String[] args) {
		String[] names = {"Razat", "Garry", "Magoo","Sukhpreet","Anagh","Razat","Garry"};
		String[] names1 = {"Razat","Arshit","Anagh","Sidharth"};
		//creation
		HashSet<String> hs = new HashSet<>(); 
		HashSet<String> hs1 = new HashSet<>(20);
		HashSet<String> hs2 = new HashSet<>(20,0.8f);
		//HashSet<String> hs3 = new HashSet<>(Collection<? extends E> c); 
		
		//adding elements. 
		for(String name: names) {
			hs.add(name);
		}
		System.out.println("hs :"+hs);
		
		for(String name: names1) {
			hs1.add(name);
		}
		
		//updating elements. 
		//e.g. Garry = Arshit
		String nickname = "Garry",firstname="Arshit"; 
		if(hs.contains(nickname)) {
			hs.remove(nickname);//removing. 
			hs.add(firstname);
		}
		System.out.println("hs :"+hs);
		
		hs2=(HashSet<String>)hs.clone();
		
		//retainAll method. -- intersection 
		hs2.retainAll(hs1);
		System.out.println("hs2 :"+hs2.hashCode()+" "+hs2);
		System.out.println("hs :"+hs2.hashCode()+" "+ hs);
		
		//iterating all the elements. 
		Iterator<String> itr = hs.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//size 
		System.out.println(hs.size()); 
		
		
	
		
	}

}
