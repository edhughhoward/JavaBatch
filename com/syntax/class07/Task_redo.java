package com.syntax.class07;

public class Task_redo {
public static void main(String[] args) {
	// Create a boolean variable workDay and assign true create int variable day and assign it to 1
	// As long as it is workDay print “I need a day off” and increase day.
	//Once day is 6 print “I do not need a day off any more”
	
	/*
	 * // 
	 * 1.Print numbers from 1 to 100 in 1 line with space ----- check
	 * 1.Print numbers from 100 to 1 ----- check
	 * 1.Print even numbers from 20 to 1 (2 ways)
	 * 1.Print odd numbers between 20 and 50 (2 ways)
	 */
	
	boolean workDay = true;
	int day = 1;
	
	while (day < 6) {
		if (workDay) {
		System.out.println("I need a day off");	
		day++;
		} else {
			System.out.println("I do not need a day off anymore");
			workDay = false;
		}
	} 
	
	for (int i = 0; i <= 100; i++) {
		System.out.print(i + " ");
	}
	System.out.println();
	for (int i = 100; i >=0; i--) {
		System.out.print(i + " ");
	}
	System.out.println();
	
	for (int i = 20; i >=0; i-=2) {
		System.out.print(i + " ");
	}
	System.out.println();
	for 
}
}
