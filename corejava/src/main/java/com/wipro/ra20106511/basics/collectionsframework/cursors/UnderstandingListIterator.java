package com.wipro.ra20106511.basics.collectionsframework.cursors;

import java.util.ListIterator;
import java.util.Stack;

public class UnderstandingListIterator {

	public static void main(String[] args) {
		
		//creating an object of type List<E>
		Stack<Integer> s = new Stack<>();
		
		//adding elements in stack. 
		for(int i=0; i<20; i+=2) {
			s.push(i);//autoboxing. 
		}
		
		//reading using List iterator forward direction. 
		ListIterator<Integer> itr_f = s.listIterator(); 
		while(itr_f.hasNext()) {
			System.out.print(itr_f.nextIndex()+" : ");
			System.out.println(itr_f.next());
		}
		System.out.println(s);
		
		//reading using List iterator backward direction. 
		//ListIterator<Integer> itr_b = s.listIterator();
		while(itr_f.hasPrevious()) {
			System.out.print(itr_f.previousIndex()+" : ");
			System.out.println(itr_f.previous());
		}
		System.out.println(s);
		
		//updating odd index values to double. 
		while(itr_f.hasNext()) {
			if(itr_f.nextIndex()%2!=0) {
				itr_f.set(itr_f.next()*2);
			}else {
				itr_f.next();//incrementing the cursor. 
			}
		}
		System.out.println(s);
		
		//removing multiples of 5.  
		while(itr_f.hasPrevious()) {
			if(itr_f.previous()%5==0) {
				itr_f.remove();
			}
		}
		System.out.println(s);
		//adding 5 multiples if number is 1 close to 5. 
		int temp; 
		System.out.print("[");
		while(itr_f.hasNext()) {
			temp=itr_f.next();
			System.out.print(temp+" , ");
			if(temp%5==1 || temp==4) {
				itr_f.add(temp*5);
				System.out.print(temp*5 +" , ");
			}
		}
		System.out.println("]");
		System.out.println(s);
		
	}

}
