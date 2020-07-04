package com.syntax.class14;

public class StringMethodpt2 {
public static void main(String [] args) {
	
	System.out.println("====================.contains() method========================");
	
	String str = "Good Afternoon All";
	
	boolean contains = str.contains("afternoon");
	System.out.println(contains);
	
	String searchValue = "Good";
	
	boolean isItThere = str.contains(searchValue);
	System.out.println(isItThere);
	
	System.out.println(str.contains("A"));
	
	System.out.println(str.contains("After"));
	
	System.out.println("====================.startsWith() method========================");
	
	String drink = "Welcome students";
	boolean starts = drink.startsWith("Welcome");
	System.out.println(starts);
	
	System.out.println("====================.endsWith() method========================");
	boolean ends = drink.endsWith("a");
	System.out.println(ends);
	
	String str1 = "Hello Mohammad";
	String str2 = "Hello Bulat";
//	
//	str1.startsWith("Hello");
//	str1.endsWith("Bulat");
	
	System.out.println(str1.startsWith("Hello"));
	System.out.println(str2.endsWith("Bulat"));
	
	System.out.println("====================.equals() method========================");

	String string1 = "Saturday";
	String string2 = "saturday";
	
	boolean equality = string1.equals(string2);
	
	System.out.println(equality);
	
	System.out.println("====================.equalsIgnoreCase() method========================");

	boolean equalityNoCase = string1.equalsIgnoreCase(string2);
	System.out.println(equalityNoCase);
	
	String expected = "Password cannot be empty";
	String actual = "Password can not be empty";
	
	if (expected.equals(actual)) {
		System.out.println("Test pass");
	} else {
		System.out.println("Test fail");
	}
	
	System.out.println("====================real example.equalsIgnoreCase method========================");
	String expectedBrowser = "Chrome";
	String actualBrowswer = "chrome";
	
	if (expectedBrowser.equalsIgnoreCase(actualBrowswer)) {
		System.out.println("Test passed");
	} else {
		System.out.println("Test failed");
	}
	
}
}
