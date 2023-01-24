package com.wipro.ra20106511.collectionsframework;

import java.util.Optional;

public class UserStats{
	
	private Long visitCount;
	
	public UserStats() {}
	
	public UserStats(Long visitCount) {
		this.visitCount = visitCount; 
	}
	
	public Optional<Long> getVisitCount(){
		return Optional.of(visitCount);
	}
}