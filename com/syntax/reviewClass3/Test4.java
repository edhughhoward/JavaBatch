package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your gender: M or F");
		char sex = keyboard.next().charAt(0);
		char f = 'F';
		char m = 'M';
		System.out.println("Please enter your age");
		int age = keyboard.nextInt();
		
		if (age > 25) {
			if (sex == f) {
				System.out.println("Woman");
			}else if (sex == m){
				System.out.println("Man");
		}
	
			
		} else if (age < 25){
			if (sex == f) {
				System.out.println("Girl");
			} else if (sex == m){
				System.out.println("Boy");
			}
		}
		
		keyboard.close();
		
		
		
		
	}
}
