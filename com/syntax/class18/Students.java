package com.syntax.class18;

public class Students {
	/*
	 * Create a Class called Students Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 */
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		
		Students student1 = new Students();
		student1.studentName = "Alex";
		student1.studentID = 22;
		numberOfStudents++;
		
		Students student2 = new Students();
		student2.studentName = "Tom";
		student2.studentID = 33;
		numberOfStudents++;
		
		Students student3 = new Students();
		student3.studentName = "Ed";
		student3.studentID = 901;
		numberOfStudents++;
		
	
		
		System.out.println("Number of students is " + numberOfStudents);
	}
}
