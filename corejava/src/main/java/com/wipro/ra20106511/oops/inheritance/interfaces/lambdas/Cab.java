package com.wipro.ra20106511.oops.inheritance.interfaces.lambdas;

@FunctionalInterface
public interface Cab {
	public static final double MILES_TO_KM = 1.6;
	public abstract double bookCab(double source,double destination);
	//determines the fees for the distance between source and destination. 
}
