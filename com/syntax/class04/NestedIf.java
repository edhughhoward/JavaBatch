package com.syntax.class04;

public class NestedIf {
	public static void main(String [] args) {
		boolean isMorning = true; 
		boolean isSchool = false;
		int time = 20;
		
		if (isMorning) {
			System.out.println("Good Morning");
			
			if (isSchool) {
				System.out.println("Friends");
			} else {
				System.out.println("Family");
			}
		} else {
			System.out.println("It is not morning");
			
			if (time < 18) {
			System.out.println("Good afternoon");
		} else {
			System.out.println("Good evening");
		}
		}
		System.out.println("Vik has no questions");
		
		
		
		
		
	}
}
