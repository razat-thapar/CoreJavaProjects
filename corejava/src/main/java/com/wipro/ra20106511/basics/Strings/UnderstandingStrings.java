package com.wipro.ra20106511.basics.Strings;

public class UnderstandingStrings {
	public static void main(String[] args){
	
		//creating a string using string literals. 
		String s1 = "Hello";
		String s2 = "Hello";
		
		//creating a string using new operator. 
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		//checking equality of String objects created using different approaches.  
		if(s1==s2) {
			System.out.println("String objects refering to same object s1=s2");
		}else {
			System.out.println("string objects referring to different objects. s1!=s2");
		}
		if(s3==s4) {
			System.out.println("String objects refering to same object s3=s4");
		}else {
			System.out.println("String objects refering to different objects s3!=s4");
		}
	
		//checking equality of string contents instead of reference address of objects in JVM heap memory. 
		if(s1.equals(s2)) {
			System.out.println("String objects refering to same string value s1 equals s2");
		}else {
			System.out.println("string objects referring to different string values s1 not equals s2");
		}
		if(s3.equals(s4)) {
			System.out.println("String objects refering to same string value s3 equals s4");
		}else {
			System.out.println("String objects refering to different string value s1 equals s2");
		}
		
		//string methods. 
		String s5 = "A lazy dog jumped over the fox";
		System.out.println("Hashcode of s5 : "+s5.hashCode());
		System.out.println("String S5 = "+s5);//concatenation using operator overloading of + operator
		System.out.println("Length of string"+s5.length());
		System.out.println("chatAt 5th position : "+ s5.charAt(4));
		String s6=s5.toUpperCase();
		String s7=s5; 
		System.out.println("hascode of S6 is : "+s6.hashCode());
		System.out.println("converting S5 to uppercase S6 : "+s6);
		System.out.println("hashcode of S7 is : "+s7.hashCode());
		 
		String s8 = new String("A lazy dog jumped over the fox");
		System.out.println("Hashcode of s8 : "+s8.hashCode());
		System.out.println("String S8 = "+s8);//concatenation using operator overloading of + operator
		
		//Testing String immuatability. 
		String s10 = new String("Hello");
		s10.concat("World");
		System.out.println("S10: "+s10);//Strings are immutable 
		StringBuffer s11= new StringBuffer("Hello");
		s11.append("World");
		System.out.println("S11: "+s11);//StringBuffer are mutable. 
		StringBuilder s12 = new StringBuilder("Hello");
		s12.append("World");
		System.out.println("S12 : "+s12);//StringBuilder are mutable.   
	
	}	 
}
