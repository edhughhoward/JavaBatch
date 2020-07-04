package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
	System.out.println("Is it weekend?");
	boolean weekend = keyboard.nextBoolean();
	
	if (!weekend) {
		System.out.println("Today you will be learning Manual testing ");
	} else {
		System.out.println("Today you will be learning Java");
	}
	
	
	
	
	keyboard.close();
	
	}

}
