package com.wipro.ra20106511.oops.inheritance.interfaces.lambdas;

public class OlaCab implements Cab{

	@Override
	public double bookCab(double source, double destination) {
		System.out.println("Ola Cab booked !!");
		return (destination-source)*10.5; 
		//10.5 rupees per km distance. charge of OLA. 
	}
	
}
