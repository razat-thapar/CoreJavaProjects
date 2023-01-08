package com.wipro.ra20106511.oops.inheritance.interfaces.lambdas;

public class ImplementingFunctionalInterface {
	
	//instance variable. 
	private double dollar_to_INR;
		
	public double getDollar_to_INR() {
		return dollar_to_INR;
	}

	public void setDollar_to_INR(double dollar_to_INR) {
		this.dollar_to_INR = dollar_to_INR;
	}

	public static void main(String[] args) {
		
		//instance variable.
		ImplementingFunctionalInterface obj = new ImplementingFunctionalInterface();
		obj.setDollar_to_INR(82.4);
		
		//prior to java 1.8 the below approach was used to implement functional interfaces
		System.out.println("###Approach : 1 : Using runtime polymorphism");
		Cab c1 = new OlaCab();
		System.out.println("fare: "+c1.bookCab(23.1, 45.1));
		
		Cab c2 = new UberCab();
		System.out.println("fare: "+c2.bookCab(34.2, 79.9));
		
		//prior to java 1.8 the below approach was used to implement functional interfaces
		System.out.println("###Approach : 2 : Using anonymous class");
		Cab c3 = new Cab() {
			@Override
			public double bookCab(double source,double destination) {
				System.out.println("Cab Service booked using anonymous class!");
				return (destination-source)*30*Cab.MILES_TO_KM; 
			}
		};
		System.out.println("fare: "+c3.bookCab(32, 34));
		
		//since java 1.8 below approach using lambda functions is used. 
		System.out.println("###Approach : 3 : Using Lambda functions. ");
		Cab c4 = (double source,double destination) -> 
						{
						System.out.println("Cab booked using lambda functions"); 
						return (destination-source)*3.5*Cab.MILES_TO_KM; 
						};
		System.out.println("fare: "+c4.bookCab(32, 34));						
		
		//argument types are optional in lambda functions as same is present in method signature of functional interface.
		
		Cab c5 = (source,destination) -> 
						{
						double chargeperkm=3.5;//local variable. 
						System.out.println("Cab booked using lambda functions"); 
						//accessing static variable of functional interface and instance variable of main class.
						return (destination-source)*chargeperkm*Cab.MILES_TO_KM*obj.getDollar_to_INR(); 
						};
		System.out.println("fare: "+c5.bookCab(32, 34));

	}

}
