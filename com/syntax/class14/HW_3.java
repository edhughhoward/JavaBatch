package com.syntax.class14;

import java.util.Scanner;

public class HW_3 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter moms first name");
		String name2 = scan.nextLine();
		
		System.out.println("Please enter dads first name");
		String name1 = scan.nextLine();
		
		System.out.println("Type boy or girl");
		String gender = scan.nextLine();
		
		String babyName;
		
		if (gender.equals("boy")) {
			System.out.println("Congratulations, its a boy");
			babyName = name1.substring(0, name1.length()/2) + name2.substring(name2.length()/2);
		
		}else if (gender.contentEquals("girl")) {
			System.out.println("Congratulations its a girl");
			babyName = name2.substring(2, name2.length()/2) + name1.substring(0,name1.length()/2);
		} else {
			babyName = "Unknown";
		}
			
			System.out.println(babyName);
		}
	
		
	
		
		
		
		
	

}
