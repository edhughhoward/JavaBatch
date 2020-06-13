package com.youtube.tutorials;

import java.util.Scanner;

public class ScannerTutorial {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("What's your first name?");
		String name = scan.next();
		System.out.println(name);
		
		System.out.println("what is your age?");
		int age = scan.nextInt();
	
		System.out.println("what is your senior quote?");
		String quote = scan.next();
		
		
		
				}

}
