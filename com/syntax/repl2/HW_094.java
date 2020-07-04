package com.syntax.repl2;

public class HW_094 {
	public static void main(String [] args) {
//	Create a String given="I love Java classes at Syntax"
//			Retrieve 2 Strings from given String and print them 
//
//			Expected Output:
//			classes at Syntax
//			I love Java
		String given = "I love Java classes at Syntax";
		
		System.out.println(given.substring(12, 29));
		System.out.println(given.substring(0, 11));
}
}