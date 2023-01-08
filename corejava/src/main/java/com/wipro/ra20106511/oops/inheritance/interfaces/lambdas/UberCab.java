package com.wipro.ra20106511.oops.inheritance.interfaces.lambdas;

public class UberCab implements Cab {

	@Override
	public double bookCab(double source, double destination) {
		System.out.println("Uber Cab booked !!");
		return (destination-source)*11.5;
	}

}
