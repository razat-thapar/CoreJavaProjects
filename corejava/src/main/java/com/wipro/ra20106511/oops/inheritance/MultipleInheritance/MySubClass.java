package com.wipro.ra20106511.oops.inheritance.MultipleInheritance;

public class MySubClass implements MySubInterface1,MySubInterface2 {

	@Override
	public void display() {
		
		System.out.println("Inside MySubClass display()");
		
	}

	@Override
	public void display2() {
		
		System.out.println("Inside MySubClass display2()");
		
	}

}
