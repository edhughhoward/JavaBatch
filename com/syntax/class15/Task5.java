package com.syntax.class15;

public class Task5 {
public static void main (String [] args) {
	
	String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
	
	a = a.replaceAll("[^?]", "");
	
	System.out.println(a.length());
	
	// or
	
	String b = "Is it saturday? Is it raining? Do we have a Java Class today?";
	
	String [] array = b.split("[?]");
	
	int array2 = array.length;
	
	System.out.println(array2);
	
}
}
