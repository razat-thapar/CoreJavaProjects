package com.wipro.ra20106511.basics.generics.classes;

public class Main {

	public static void main(String[] args) {
		//invoking a single type parameterized class. 
		Glass<Juice> juiceGlass = new Glass<Juice>(); 
		Glass<Water> waterGlass = new Glass<Water>();
		
		juiceGlass.setLiquid(new Juice());
		waterGlass.setLiquid(new Water());
		System.out.println(juiceGlass.getLiquid().getDetails());
		System.out.println(waterGlass.getLiquid().getDetails());
		
		//invoking a multiple type paramertized class.
		Red red = new Red(); 
		Green green = new Green(); 
		Blue blue = new Blue(); 
		//using parameterized constructor here. 
		Color<Red,Green,Blue> color1 = new Color<>(red,green,blue);
		
		System.out.println(color1);

	}

}
