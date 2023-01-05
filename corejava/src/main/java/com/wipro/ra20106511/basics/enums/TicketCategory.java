package com.wipro.ra20106511.basics.enums;

//enumeration data type in java. 
public enum TicketCategory implements TicketDescription{
	CRITICAL(1,"critical"){@Override public String getSLA() {return "2hrs";}},
	HIGH(2,"high"){ @Override public String getSLA() {return "6hrs";}},
	MEDIUM(3,"medium"){ @Override public String getSLA() {return "48hrs";}},
	LOW(4,"low"){ @Override public String getSLA() {return "96hrs";}};
	
	//fields
	private int priority;
	private String description; 
	
	//constructors
	private TicketCategory(){
		//default constructor
		System.out.println("Inside default Constructor");
		System.out.println("Created "+this.toString());
	}
	
	private TicketCategory(int priority,String description){
		//parameterized constructor.
		System.out.println("Inside parameterized Constructor");
		System.out.println("Created "+this.toString());
		this.priority=priority; 
		this.description=description; 
	}
	
	//concrete methods
	public int getPriority() {
		return this.priority;
	}
	public String getDescription() {
		return this.description;
	}
	
	//abstract methods
	public abstract String getSLA();
	

	//interface methods
	public String getDetailedDescription() {
		return "Ticket Priority is : "+this.priority + " and Ticket category is : "+this.description + " and SLA is : "+ this.getSLA();
	}
}
