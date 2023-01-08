package com.wipro.ra20106511.oops.inheritance.interfaces;

public interface MyInterface {
	
	public static final float PI=3.14f;
	public abstract void display();
	
	//applicable to JDK1.8 or above. 
	public static void myMethod() {
		MyInterface.myStaticMethod2();
		System.out.println("My static method");
	}
	
	//applicable to JDK1.8 or above.
	public default void myDefaultMethod() {
		this.myPrivateMethod();
		System.out.println("This is my default method. ");
	}
	
	//applicable to JDK 9 or above.
	private void myPrivateMethod() {
		System.out.println("My Private method");
	}
	
	//applicable to JDK 9 or above.
	private static void myStaticMethod2() {
		System.out.println("This is my static Method!");
	}
	
	

}
