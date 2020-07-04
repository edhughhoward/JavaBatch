package com.syntax.class08;

public class BreakAndContinue {
public static void main(String [] args) {
	
	
	
	for (int i = 1; i <= 10; i++) {
		System.out.println(i);
		if (i ==4) {
			break;
		}
	}
System.out.println("We are outside of the loop");




System.out.println("==========================");
for (int i = 1; i <= 10; i++) {
	
	if (i ==4) {
		continue;
	}
	System.out.println(i);
}
System.out.println("we are outside the loop");

System.out.println("===============================");
for (int i = 1; i < 11; i++) {
	if (i == 5 || i==6 || i==7) {
		continue;
	}
	System.out.println(i);
	
}

System.out.println("we are outside ");

System.out.println("================================");



for (int i =1; i <= 100; i++) {
	
	if (i>=35 && i<=55) {
		continue;
	}
	System.out.println(i);
} 



}
}
