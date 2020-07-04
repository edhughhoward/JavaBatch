package com.syntax.class10;

public class Array2 {
public static void main(String [] args) {
	
	// Created array and stored the initial value
	String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
	
	System.out.println(weekdays [3]);
	
	//1st way
	double [] balances = {1000, 23.50, 5540.5};
	System.out.println("Total money is: " + (balances[0] + balances[1] + balances[2]));
	
	//2nd way
	int total1 =  (int) balances[0] +(int) balances[1] + (int)balances[2];
	
	//3rd way
	int total2 = (int) (balances[0] + balances[1] + balances[2]);
	System.out.println("total2 is: " + total2);
	
	int[] numbers1;
	int [] numbers2 = {};
	numbers2[0] = 5;
	System.out.println(numbers2[0]);
	
	
	
}
}
