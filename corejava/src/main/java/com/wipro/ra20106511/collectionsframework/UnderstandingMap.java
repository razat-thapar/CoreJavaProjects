package com.wipro.ra20106511.collectionsframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UnderstandingMap {
	
	public static void main(String[] args) {
		Map<String, UserStats> hm = new HashMap<String,UserStats>(); 
		
		
		hm.put("1", new UserStats(23L));
		hm.put("2", new UserStats(32L));
		hm.put("3", new UserStats(0L));
		hm.put("a", new UserStats(0L)); 
		
		if(hm.isEmpty()) {
			System.out.println("Map is empty please initialize it. ");
		}else {
			if(hm.containsKey("1")) {
				UserStats oldvalue = hm.get("1")			;
				hm.put("1", new UserStats(34L));
			}else {
				hm.put("1", new UserStats(43L));
			}
			
			
			for(Map.Entry<String, UserStats> me : hm.entrySet()) {
				//printing values  : 
				try {
					System.out.print(Long.parseLong(me.getKey()) + ":");
				}catch(NumberFormatException e ) {
					continue; 
				}
				Optional<Long> v = me.getValue().getVisitCount();
				if(v.isPresent()) {
					System.out.println(v.get());
				}else {
					continue; 
					
					
				}
				
			}
		}
	}

}


