package com.syntax.repl4;

public class Student extends Employee {
	int grade;
	Student(String name, String lastName, int age, int grade) {
		super(name, lastName, age, grade);
		this.grade = grade;

	}
	public void detailsStu() {
		System.out.println(name + " " + lastName + " " + age + " " + grade);
	}
}