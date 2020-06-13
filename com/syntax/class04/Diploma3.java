package com.syntax.class04;

public class Diploma3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program to store a boolean value of whether user has diploma or not. 
 * If the user has a diploma, you should say "congratulations", otherwise program should suggest to "get a degree :(" 
 * Then if user has a degree program should check a gpa score. 
 * If gpa score is higher or equals to 3.5 output should say "You are eligible for scholarship", otherwise "You should have studied harder".
 * 
 * 
 * 
 */
	boolean diploma = true; 
	double gpa = 4.3;
	
	if (diploma) {
		System.out.println("Congratulations!!!");
		if (gpa >= 3.5) {
			System.out.println("You are eligible for a scholarship");
			
		} else {
			System.out.println("You should have studied harder");
		}
	} else {
		System.out.println("GET A DEGREE :(");
	}
	
	System.out.println("=======================================");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
