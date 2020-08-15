package com.syntax.repl4;

public class Retiree extends Student {
	String seniorActivity;
	Retiree (String name, String lastName, int age, String seniorActivity) {
		super(name, lastName, age, seniorActivity);
		this.seniorActivity = seniorActivity;
}
	public void detailsRet() {
		System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
	}
}