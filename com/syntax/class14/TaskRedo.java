package com.syntax.class14;

import java.util.Scanner;

public class TaskRedo {
public static void main (String [] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter User name");
	String username = scan.nextLine();
	
	System.out.println("Please enter password");
	String password = scan.nextLine();
	
	if (username.isEmpty() || password.isEmpty()) {
		System.out.println("Username and password can not be empty");
	} else {
		if (password.length() > 8) {
			if (!password.contains(username)) {
				System.out.println("confirm password");
				
				String password2 = scan.nextLine();
			
			if (password.equals(password2)) {
				System.out.println("You have created your username and password");
			} else {
				System.out.println("Your password does not match");
			}
		} else {
			System.out.println("Password can not have username");
		}
	} else {
		System.out.println("password is too short");
	}
	// add a loop to this project
	
	
	}
	
}
}
