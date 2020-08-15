package com.syntax.repl6;

public class Main182 extends Person {

	public Main182(String firstname, String lastname, String birthmonth, int birthday, int birthyear, String ssn) {
		super(firstname, lastname, birthmonth, birthday, birthyear, ssn);
	}

	public static void main(String[] args) {
		Person obj = new Person("John", "Doe", "10", 25, 1900, "123-45-6789");
		System.out.println(obj.getFirstname());
		System.out.println(obj.getLastName());
		obj.getBirthmonth();
		obj.getBirthday();
		obj.getBirthyear();
		obj.formatBirthday();
		System.out.println(obj.getSsn());
	}
}
