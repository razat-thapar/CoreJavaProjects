package com.wipro.ra20106511.basics.generics.boundedtypeparameters;

//generic class with bounded type parameter. 
//hence, T should be having Is-A relation with Bounded type i.e. Liquid.
public class Glass<T extends Liquid> {
	private T liquid; 
	
	//parameterized constructor. 
	public Glass(T liquid) {
		this.liquid=liquid; 
	}
	
	//method 
	public String getLiquidTaste() {
		return liquid.getTaste();
	}
	
	//generic method 
	public <W extends Water> boolean getPurity(W water){
		return water.isPure();
	}
}
