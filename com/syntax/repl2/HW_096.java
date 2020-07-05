package com.syntax.repl2;

import java.util.Scanner;

public class HW_096 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
			System.out.println("Enter any programming language");
			String language = sc.nextLine();
			String message;

			switch (language.toLowerCase()) {

			case "java":
				message = "Java is a programming language";
				break;
			case "c":
				message = "C is a procedural programming language";
				break;
			case "c++":
				message = "C++ is a middle-level programming language";
				break;
			default:
				message = "Doesn't match any programming language";
			}

			System.out.println(message);
	  }
	}
		  
	
