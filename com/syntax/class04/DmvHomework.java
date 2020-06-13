package com.syntax.class04;

import java.util.Scanner;

public class DmvHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age below:");
		int text = scan.nextInt();
		if (text >= 18) {
			System.out.println("You will be issued a drivers license");
		} else {
			System.out.println("You will be offered a learners permit");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
