package com.syntax.class11;

public class RetrieveElements2 {
	public static void main(String [] args) {
		System.out.println("===Array with For Loop===");
		// can be modified
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
}
		System.out.println();
		
		System.out.println("=== Print Using Advanced Loop===");
		// has to be the whole array
		// can't go backwards
		//   type  element  array name     
		for (char element : grades) {
			System.out.print(element);
		}
		System.out.println();
		String [] fruits = {"Apple", "Orange", "Grapes", "Banana", "Cucumber"};
		for (String element2 : fruits) {
			if (element2.equals("Grapes")) {
				System.out.println(element2 + " Is my fav fruit");
			} else {
				System.out.println(element2);
			}
		
		}
		System.out.println();
		for (int j = 0; j < fruits.length; j++) {
			if (fruits[j].contentEquals("Grapes")) {
				System.out.println(fruits[j] + " is my favorite fruit");
			} else {
				System.out.println(fruits [j] + " ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}