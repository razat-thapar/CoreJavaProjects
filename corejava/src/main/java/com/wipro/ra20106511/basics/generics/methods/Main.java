package com.wipro.ra20106511.basics.generics.methods;

import com.wipro.ra20106511.basics.generics.classes.Alchol;
import com.wipro.ra20106511.basics.generics.classes.Juice;
import com.wipro.ra20106511.basics.generics.classes.Water;

public class Main {

	public static void main(String[] args) {
		Juice juice = new Juice(); 
		Water water = new Water(); 
		Alchol alchol = new Alchol(); 
		Bartendar bartendar  = new Bartendar(); 
		//invoking methods without using type inference
		bartendar.<Juice,Water>mix(juice, water);
		
		//invoking methods using type inference
		bartendar.mix(juice, water, alchol);
		
		//calling static method
		Bartendar.mix2(juice, water);
	}

}
