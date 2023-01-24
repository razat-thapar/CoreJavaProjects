package com.wipro.ra20106511.basics.generics.methods;

public class Cocktail2<J, W> {
	private J j; 
	private W w;
	
	
	public Cocktail2(J j, W w) {
		super();
		this.j = j;
		this.w = w;
	}
	public J getJ() {
		return j;
	}
	public void setJ(J j) {
		this.j = j;
	}
	public W getW() {
		return w;
	}
	public void setW(W w) {
		this.w = w;
	}
	@Override
	public String toString() {
		return "Cocktail2 [j=" + j + ", w=" + w + "]";
	} 
	
	

}
