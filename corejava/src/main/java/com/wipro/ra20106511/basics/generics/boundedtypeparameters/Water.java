package com.wipro.ra20106511.basics.generics.boundedtypeparameters;

public class Water implements Liquid {
	private boolean pure; 
	
	public Water(boolean pure) {
		this.pure=pure; 
	}
	
	@Override
	public String getTaste() {
		return "Tasteless";
	}
	
	public boolean isPure() {
		return this.pure; 
	}

}
