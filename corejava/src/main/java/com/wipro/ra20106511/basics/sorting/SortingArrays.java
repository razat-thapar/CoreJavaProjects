package com.wipro.ra20106511.basics.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrays {

	public static void main(String[] args) {
		//primitive array
		int[] numbers = {1,523,23,34,2,111,-21};
		//objects array
		Integer[] numbers2 = {1,523,23,34,2,111,-21};
		
		//Sorting primitive array 
		System.out.println("Sorting primitive array in natural ordering as defined in Integer class");
		Arrays.sort(numbers);
		//printing.
		for(int num: numbers) {
			System.out.print(num+" ");
		}
		
		//Sorting object array using custom sorting via comparator interface. 
		//using comparator
		Comparator<Integer> ascendingOrder= new Comparator<Integer>() {
			@Override
			public int compare(Integer x,Integer y) {
				//here, +ve means 2nd argument comes first
				//0 means both are same so ordering doesn't matter. 
				if(x.intValue()>y.intValue()) {
					return 1; //2nd argument i.e. y comes first. here y<x so, ascending order.
				}else if(x.intValue()<y.intValue()) {
					return -1; //1st argument i.e x comes first . here x<y so, ascending order. 
				}else {
					return 0;
				}
			}
		};
		
		Comparator<Integer> descendingOrder= new Comparator<Integer>() {
			@Override
			public int compare(Integer x,Integer y) {
				//here, +ve means 2nd argument comes first
				//0 means both are same so ordering doesn't matter. 
				if(x.intValue()<y.intValue()) {
					return 1; //2nd argument i.e. y comes first. here y>x so, descending order.
				}else if(x.intValue()>y.intValue()) {
					return -1; //1st argument i.e x comes first . here x>y so, descending order. 
				}else {
					return 0;
				}
			}
		};
		
		
		Arrays.sort(numbers2, descendingOrder);
		System.out.println("Sorting in reverse");
		for(int num: numbers2) {
			System.out.print(num+" ");
		}

	}

}
