package com.wipro.ra20106511.basics.Strings.Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexMatches {

	public static void main(String[] args) throws IOException {
		
		//input String
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int count=0;
		while(count<10) {
			System.out.print("Please enter some String: + ");
			String input = br.readLine();
			//patterns
			String[] patterns = {"^[a-tA-T]+$","[a-tA-T]+","[aeiou]","[aeiou]+","[a-sA-S]+","[R][a-z]{5,10}"};
			for(String pattern : patterns) {
				System.out.println("##### Approach 1 : ");
				System.out.print( pattern+" matches "+input+" >>>" );
				System.out.println(Pattern.matches(pattern, input));
				
				System.out.println("##### Approach 2: ");
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(input);
				if(m.matches()) {
					System.out.println(pattern+" matches "+input+" >>> true" );
					System.out.println("substring that matches the pattern : "+m.group());
				}else {
					System.out.println(pattern+" matches "+input+" >>> false" );
				}
			}
			count++;
		}
		
		
		
		br.close();
		
		
		
		
	}

}
