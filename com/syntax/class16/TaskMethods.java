package com.syntax.class16;

public class TaskMethods {

	void numbers(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger");
		} else {
			System.out.println(b + " is larger");
		}
	}
	
	void numbers2(int a) {
		if (a % 2 ==0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}
	
	void words(String text) {
		String reverseString = "";
		for (int i = text.length()-1; i >=0; i--) {
			reverseString = reverseString + text.charAt(i);
		}
		System.out.println(reverseString);
	}
	void palindrome(String word) {
		String b ="";
		for (int i = word.length()-1; i >=0; i--) {
			b += word.charAt(i);
		}
		if (b.equals(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " is not palindrome");
		}
	}
	void sayHello(String country) {

		country = country.toLowerCase();

		switch (country) {

		case "usa":
			System.out.println("Hello");
			break;

		case "turkey":
			System.out.println("Merhaba");
			break;

		case "egypt":
			System.out.println("Ehlen wa Sahlen");
			break;
			
		default:
			System.out.println("Hi");
		}
	}
	
}
