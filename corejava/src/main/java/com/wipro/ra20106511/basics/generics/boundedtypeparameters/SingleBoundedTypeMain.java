package com.wipro.ra20106511.basics.generics.boundedtypeparameters;

public class SingleBoundedTypeMain {

	public static void main(String[] args) {
		
		System.out.println("### Single Type Bounded Parameter## example");
		
		Juice juice = new Juice(); 
		Water water = new Water(true); 
		Glass<Juice> juiceGlass = new Glass<>(juice); 
		Glass<Water> waterGlass = new Glass<>(water);
		//bound mismatch exception as Type parameter can only be of type Liquid. 
		//Glass<Diesel> dieselGlass = new Glass<>(); 
		
		//invoking methods
		System.out.println(juiceGlass.getLiquidTaste());
		System.out.println(waterGlass.getLiquidTaste());
		System.out.println(waterGlass.getPurity(water));
		//below will not work as it's bounded to only Water type. 
		//System.out.println(juiceGlass.getPurity(juice));
		

	}

}
