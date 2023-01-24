package com.wipro.ra20106511.basics.generics.classes;

public class Color<R, G, B> {
	private R red; 
	private G green; 
	private B blue; 
	
	//default constructor. 
	public Color() {
		
	}
	
	//parameterized constuctor. 
	public Color(R red, G green , B blue) {
		this.red= red; 
		this.green= green; 
		this.blue = blue; 
	}
	
	public R getRed() {
		return this.red; 
	}
	
	public G getGreen() {
		return this.green; 
	}
	
	public B getBlue() {
		return this.blue; 
	}
	
	public void setRed(R red) {
		this.red = red; 
	}
	public void setGreen(G green) {
		this.green = green; 
	}
	public void setBlue(B blue) {
		this.blue = blue; 
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
	
	

}
