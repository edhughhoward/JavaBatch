package com.syntax.class16;

public class DifferentMethods {
	// lets creat a method: "Hello" 10x
	void sayHello(int times) {

		for (int i = 0; i < times; i++) {
			System.out.println("Hello");
		}
	}
	void printAnyWord(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
	void isHungry(boolean areYouHungry) {
		if (areYouHungry) {
			System.out.println("Please cook for yourself");
		} else {
			System.out.println("Im not hungry");
		}
	}
	//Task 1
	void larger (int a, int b) {
		
		if (a > b) {
			System.out.println(a + " is larger ");
		} else {
			System.out.println(b + " is larger ");
		}
	}
	
	void evenOrOdd (int a) {
		if (a %2==0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
	void hello (String country) {
		country = country.toLowerCase();
		switch (country) {
		case "usa":
			System.out.println("Hello");
			break;
		case "France":
			System.out.println("Bonjour");
			break;
		case "Spain":
			System.out.println("Hola");
		break;
			default:
				System.out.println("Invalid");
		}
		}
	
	
	void pali (String word3) {
		String b = "";
		for (int i = word3.length()-1; i >=0; i--) {
			b+=word3.charAt(i);
		}
		if (b.contentEquals(word3)) {
			System.out.println(word3 + " is pali");
		} else {
			System.out.println(word3 + " is not pali");
		}
		
	}
}
