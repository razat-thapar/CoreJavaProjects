package com.wipro.ra20106511.basics.collectionsframework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class UnderstandingEnumeration {

	public static void main(String[] args) {
		
		Vector<Short> v = new Vector<>(); 
		//add elements
		for(short s=0; s<10; s++) {
			v.add(s);
		}
		
		//reading each element using enumeration
		Enumeration<Short> e = v.elements();
		while(e.hasMoreElements()) {
			short s = e.nextElement(); 
			if(s%2 ==0)
				System.out.println(s);
		}
		

	}

}
