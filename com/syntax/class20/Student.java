package com.syntax.class20;

public class Student {

	String name;
	int mathGrade, scienceGrade, historyGrade;

	Student(String studentName, int smathGrade, int sscienceGrade, int shistoryGrade) {
		name = studentName;
		mathGrade = smathGrade;
		scienceGrade = sscienceGrade;
		historyGrade = shistoryGrade;
	}

	int averageGrade() {
		int average = (mathGrade + scienceGrade + historyGrade) / 3;
		return average;
	}
}
