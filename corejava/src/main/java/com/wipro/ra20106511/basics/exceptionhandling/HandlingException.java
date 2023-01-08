package com.wipro.ra20106511.basics.exceptionhandling;

import java.io.File;

public class HandlingException {

	public static void main(String[] args) {
		
		int[] a = null; 
		int x=0; 
		int y=1; 
		try {
			
			try {
				//Unchecked exception. 
				System.out.println("Length of array a : "+a.length);
			}catch(NullPointerException e) {
				System.out.println("NullPointerException caught! "+e.getMessage());
			}
			
			try {
				//unchecked exception. 
				System.out.println("Result of "+y+" / "+x+" is: "+y/x);
			}catch(ArithmeticException e) {
				System.out.println("ArithmeticException caught! "+e.getMessage());
			}
			
			try {
				//checked exception. 
				//file not found. 
				File f = new File("/src/main/resources/abc.txt");
				if(f.exists()) {
					System.out.println("File exists");
				}else {
					System.out.println("File don't exists");
				}			
			}
			catch(Exception e){
				System.out.println(e.getClass().getTypeName()+" caught! "+e.getMessage());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Inside Finally block!");
		}

	}

}
