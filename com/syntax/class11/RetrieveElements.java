package com.syntax.class11;

public class RetrieveElements {
public static void main(String [] args) {
	System.out.println("=========Array with For Loop=========");
	char[] pants = {'A', 'B', 'C', 'D', 'F'};
	char[] grades = {'A', 'B', 'C', 'D', 'F'};
	
	for (int i = 0; i < grades.length; i++) {
		System.out.println(i);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	for (int i = 0; i < pants.length; i++) {
		System.out.print(pants[i] + ", ");
	}
	System.out.println();
	
	System.out.println("========Advanced Loop=========");
	
	for(char element:pants) {
		System.out.println(element);
		
	}
	System.out.print("================================");
	System.out.println();
	String[] fruits= {"Apple", "Orange", "Grapes", "Banana", "Cucumber"};
	
	for (String element:fruits) {
		System.out.println(element);
	}
	System.out.println();
	for (int i = 0; i < fruits.length; i++) {
		System.out.println(fruits[i]);
	}
}
}
