package com.syntax.class17;

public class TaskTest {

	public static void main(String[] args) {

		Task1 obj = new Task1();
		
		String email = obj.createEmail("Jane", "Smith", "yahoo");
		System.out.println(email);
		
		obj.isPrime(23);
	}

}
