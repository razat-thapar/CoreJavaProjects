package com.wipro.ra20106511.basics.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingLists {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(16);
		al.add(12);
		al.add(-12);
		
		//sort in natural ordering i.e. ascending order based on magnitude.
		Collections.sort(al);
		System.out.println(al);
		
		//sort in descending order based on magnitude.
		
		//defining comparator 
		Comparator<Integer> descendingOrder = new Comparator<Integer>() {
			@Override
			public int compare(Integer a , Integer b) {
				//+ve means 2nd argument comes first. 
				//since descending order , so we want large element comes first. 
				if(b.intValue()>a.intValue()) {
					return 1;
				}else if(b.intValue()<a.intValue()) {
					return -1;
				}else {
					return 0;
				}
			}
		};
		Collections.sort(al,descendingOrder);
		System.out.println(al);
		
		//sort in descending order based on count of factors. 
		//defining comparator 
		Comparator<Integer> descOrderBasedOnFactorsCount = new Comparator<Integer>() {
			@Override
			public int compare(Integer a , Integer b) {
				//+ve means 2nd argument comes first. 
				//since descending order , so we want large element comes first. 
				int count_a = countFactors(a.intValue());
				int count_b = countFactors(b.intValue());
				if(count_b>count_a) {
					return 1;
				}else if(count_a>count_b) {
					return -1;
				}else {
					//based on magnitude. 
					if(b.intValue()>a.intValue()) {
						return 1;
					}else if(a.intValue()>b.intValue()) {
						return -1; 
					}else {
						return 0;
					}
				}
			}
		};
		
		Collections.sort(al,descOrderBasedOnFactorsCount);
		System.out.println(al);
		
	}
	
	//count factors. 
	public static int countFactors(int num) {
		//to handle negative numbers. 
		if(num<0) {
			num=num*-1;
		}
		int count=0;
		for(int i=1;i*i<=num ; i++) {
			//factor condition.
			if(num%i==0) {
				if(i!=num/i) {
					count+=2;
				}else {
					count+=1;
				}
			}
		}
		return count; 
	}

}
