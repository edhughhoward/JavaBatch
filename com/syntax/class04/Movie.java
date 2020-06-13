package com.syntax.class04;

public class Movie {
	public static void main(String [] arg) {
		
		boolean isFriday = false;
		boolean notFriday = true;
		int day = 17;
		
		if (isFriday) {
			System.out.println("We are going to watch a movie");
			
			if (day == 13) {
			System.out.println("Watch a Scary Movie");
			} 	else {
			System.out.println("watch a Comedy");
			}
		} else {
			System.out.println("We are going to study JAVA");
		}	

			
	}
}
