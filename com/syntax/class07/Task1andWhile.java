package com.syntax.class07;

import java.util.Scanner;

public class Task1andWhile {
public static void main(String [] args) {
	Scanner keyboard = new Scanner(System.in);
	/*Create a boolean variable workDay and assign true create int variable day and assign it to 1
	 * -As long as it is workDay print “I need a day off” and increase day.
	 * -Once day is 6 print “I do not need a day off any more”
	 * 
	 */
	
	boolean workDay = true;
	int day = 1;
	
	while (workDay) {
		if (day < 6) {
		System.out.println("I need a day off");
		day ++;
	} else {
		System.out.println("I do not need a day off any more");
		workDay = false;
	}
	
	}
	
	System.out.println("================================");
	int x = 1;
	
	while (x <= 5) {
	System.out.println("Please enter your name:");
	String name = keyboard.nextLine();
	
	System.out.println("Good Afternoon " + name);
	x ++;
	}
	
	
	
}
}
