package com.syntax.class20;

public class StudentsTest {

	public static void main(String[] args) {

		Student ave = new Student("alex", 80, 90, 50);
		int grade1 = ave.averageGrade();
		System.out.println("The average grade for student is " + grade1);
		System.out.println(ave.averageGrade());
	}
}
