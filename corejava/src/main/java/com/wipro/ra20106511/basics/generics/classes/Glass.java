package com.wipro.ra20106511.basics.generics.classes;

//single type parameter class. 
public class Glass<T> {
	private T liquid;

	//default constructor 
	public Glass() {
		super();
	} 
	
	//parameterized constructor. 
	public Glass(T liquid) {
		super();
		this.liquid = liquid;
	}
	
	
	//getters and setters. 
	public T getLiquid() {
		return liquid;
	}

	public void setLiquid(T liquid) {
		this.liquid = liquid;
	}

	
	
	
}
