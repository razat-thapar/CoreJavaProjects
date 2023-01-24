package com.wipro.ra20106511.basics.generics.methods;

public class Bartendar {
	
	//generic method 
	public <J,W,A> Cocktail<J,W,A> mix(J j , W w, A a) {
		System.out.println("Cocktail prepared alcholic!");
		return new Cocktail<>(j,w,a); 
	}
	
	//generic method 1 with raw class
	public <J,W> Mocktail mix(J j , W w) {
		System.out.println("Mocktail prepared non-alcholic!");
		return new Mocktail(); 
	}
	
	//generic method 2 
	public static <J,W> Cocktail2<J,W> mix2(J j,W w) {
		System.out.println("Cocktail prepared non-alcholic!");
		return new Cocktail2<>(j,w);
	}
	
	
}
