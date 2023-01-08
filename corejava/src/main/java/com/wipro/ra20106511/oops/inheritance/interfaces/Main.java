package com.wipro.ra20106511.oops.inheritance.interfaces;

public class Main {

	public static void main(String[] args) {
		MyInterface.myMethod();
		System.out.println("Value of PI: "+MyInterface.PI);
		
		//providing implementation to my functional interface using anonymous object.
		MyFunctionalInterface obj = new MyFunctionalInterface() { @Override public void myOnlyAbstractMethod(){
			System.out.println("this is my anonymous class object");
		}} ;
		
		//calling the method . 
		obj.myOnlyAbstractMethod();
	}

}
