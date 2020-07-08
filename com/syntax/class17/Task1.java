package com.syntax.class17;

public class Task1 {
	



	
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * createEmail(John, Snow, gmail)  johnsnow@gmail.com
	 */	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();
	}
	 boolean isPrime(int a) {
		 boolean prime = true;
		 for (int i = 2; i <= a / i; i++) {
			 if (a % i ==0) {
				 prime = false;
				 break;
			 }
		 }
	 } else {
		 prime = false;
	 }
	 			return prime;
}

