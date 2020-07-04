package com.syntax.reviewClass3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter two strings");
String a = keyboard.next();
String b = keyboard.next();
System.out.println("Please enter two numbers");
int c = keyboard.nextInt();
int d = keyboard.nextInt();

if (c ==d && a.contentEquals(b)) {
	System.out.println("AND");
} else if (c == d || a.contentEquals(b)){
	System.out.println("OR");
}else if (c != d && !a.contentEquals(b)) {
	System.out.println("NONE");
}
	}

}
