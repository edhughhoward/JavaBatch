package com.syntax.class10;

public class Task03 {
public static void main(String [] args) {
	/*
	 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
	 * Then print a grade B (use 2 different ways of creating an array).
	 */
	
	char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	System.out.println(grades[1]);
	System.out.println("========================================");
	
	char [] grades2 = new char [6];
	
	grades2[0] = 'A';
	grades2[1] = 'B';
	grades2[2] = 'C';
	grades2[3] = 'D';
	grades2[4] = 'E';
	grades2[5] = 'F';
	
	System.out.println(grades2[1]);
	System.out.println("========================================");
	
	/*Create an array of names and store all names of your group. 
	 * Then print your name from that array. 
	 * (use 2 different ways of creating an array).
	 * Create an array of words: Java, Saturday, day, coding, is. 
	 * Print the following sentence using elements of array: 
	 * �Saturday is Java coding Day�.
	 */
	
	String[] words = {"Java", "Saturday", "Day", "Coding", "Is"};
	
	System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
	System.out.println("==========================================");
	// Create an array of names and store all names of your group. 
	// * Then print your name from that array. 
	// * (use 2 different ways of creating an array).
	
	String[] names = new String[5];
	
	names[0] = "Kamila";
	names[1] = "Elshan";
	names[2] = "Ed";
	names[3] = "Adrian";
	names[4] = "Sorina";
	
	System.out.println(names[2]);
	
	System.out.println("==============================");
	String[] names2 = {"Kamila", "Ed", "Elshan", "Sorina", "Adrian"};
	
	System.out.println(names2[1]);
	
	int arrLength = names2.length;
	System.out.println(arrLength);
	
	
}
}
