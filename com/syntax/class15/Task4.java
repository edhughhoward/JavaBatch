package com.syntax.class15;

public class Task4 {
public static void main(String [] args) {
	
	String words = "Hi there I am 300 years old & am happy";
	
	words = words.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(words.length());
	
	// or
	
	int words2 = words.length();
	
	System.out.println(words2);
	
	
}
}
