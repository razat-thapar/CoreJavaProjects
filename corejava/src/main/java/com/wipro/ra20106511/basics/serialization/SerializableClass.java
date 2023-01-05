package com.wipro.ra20106511.basics.serialization;

import java.io.Serializable;

public class SerializableClass implements Serializable{
	
	private final static long serialVersionUID=1L;
	
	int i ; 
	transient int j ; //don't want to persist using serialization process.   
	static final double PI = 3.1428; 
	
	public SerializableClass(int i , int j) {
		this.i=i; 
		this.j=j; 
	}
}
