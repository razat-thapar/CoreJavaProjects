package com.wipro.ra20106511.basics.enums;

import java.util.EnumMap;
import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		
		
		
		//enums in a for enhanced for loop.
		System.out.println("This is an example of enum in a for loop.");
		for( TicketCategory tc: TicketCategory.values()) {
			System.out.println(tc + " : " +  tc.getPriority() + " : " + tc.getDescription());
			System.out.println(tc.getDetailedDescription());
		}
		
		
		//enum in a switch statement . 
		System.out.println("This is an example of enum in a switch statement!");
		TicketCategory tc = TicketCategory.CRITICAL;
		switch(tc) {
			case LOW: System.out.println("This is a low ticket!");
			break; 
			case MEDIUM: System.out.println("This is a medium ticket!");
			break; 
			case HIGH: System.out.println("This is a high ticket!");
			break; 
			case CRITICAL: System.out.println("This is a critical ticket!");
			break;
			default: System.out.println("Invalid ticket category!");
		}
		
		//enums in a if-else statement. 
		System.out.println("This is an example of enum in a if-else statement");
		if(tc == TicketCategory.HIGH) {
			System.out.println("This is high ticket!");
		}else {
			System.out.println("This is not a High Ticket!");
		}
		
		
		//EnumSet 
		System.out.println("This is an example of enum in a EnumSet");
		EnumSet<TicketCategory> XYZTicketCategories = EnumSet.of(TicketCategory.CRITICAL,TicketCategory.HIGH);
		System.out.println(XYZTicketCategories.toString());
		
		//EnumMap 
		System.out.println("This is an example of enum in an EnumMap");
		EnumMap<TicketCategory,String> backlogs = new EnumMap<TicketCategory,String>(TicketCategory.class);
		backlogs.put(TicketCategory.CRITICAL, "Ticket#1");
		backlogs.put(TicketCategory.HIGH, "Ticket#2");
		System.out.println(backlogs.toString());
		
		

	}

}
