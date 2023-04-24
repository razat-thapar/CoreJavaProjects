package com.wipro.ra20106511.basics.collectionsframework.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class UnderstandingLinkedHashSet {

	public static void main(String[] args) {
		String[] names = {"1Razat", "Garry", "3Magoo","4Sukhpreet","5Anagh","Razat","Garry"};
		String[] names1 = {"1Razat","2Arshit","3Anagh","4Sidharth"};
		//creation
		LinkedHashSet<String> hs = new LinkedHashSet<>(); 
		LinkedHashSet<String> hs1 = new LinkedHashSet<>(20);
		LinkedHashSet<String> hs2 = new LinkedHashSet<>(20,0.8f);
		//LinkedHashSet<String> hs3 = new LinkedHashSet<>(Collection<? extends E> c); 
		
		//adding elements. 
		for(String name: names) {
			hs.add(name);
		}
		System.out.println("hs :"+hs);
		
		for(String name: names1) {
			hs1.add(name);
		}
		System.out.println("hs1 :"+hs1);
		//updating elements. 
		//e.g. Garry = Arshit
		String nickname = "Garry",firstname="Arshit"; 
		if(hs.contains(nickname)) {
			hs.remove(nickname);//removing. 
			hs.add(firstname);
		}
		System.out.println("hs :"+hs);
		
		hs2=(LinkedHashSet<String>)hs.clone();
		
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
