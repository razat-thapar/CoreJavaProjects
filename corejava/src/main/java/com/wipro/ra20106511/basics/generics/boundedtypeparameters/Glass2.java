package com.wipro.ra20106511.basics.generics.boundedtypeparameters;

public class Glass2<T extends Juice & Liquid> {
	private T juice;
	
	//method
	public String getJuiceTaste() {
		return this.juice.getTaste(); 
	}
}
