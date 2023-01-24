package com.wipro.ra20106511.basics.generics.methods;

public class Cocktail<J,W,A> {
	private J j ; 
	private W w ;
	private A a ; 
	public Cocktail(J j, W w,A a) {
		super();
		this.j = j;
		this.w = w;
		this.a = a; 
	}
	public Cocktail() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cocktail [j=" + j + ", w=" + w + "[a=" + a +"]";
	} 
	
	
}
