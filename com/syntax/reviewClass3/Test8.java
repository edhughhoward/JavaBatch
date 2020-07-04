package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Are you thirsty?");
boolean thirsty = keyboard.nextBoolean();

System.out.println("Are you sleepy");
boolean sleepy = keyboard.hasNextBoolean();

if (thirsty == true && sleepy == false) {
	System.out.println("Looks like you need to drink Water");
} if (thirsty == true && sleepy == true) {
	System.out.println("Lookes like you need to drink Coffee");
} if (thirsty == false && sleepy == true) {
	System.out.println("Looks like you need to drink Tea");
} else if (thirsty == false && sleepy == false) {
	System.out.println("Looks like you need to drink nothing");
}


	}

}
