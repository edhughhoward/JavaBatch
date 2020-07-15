package com.syntax.reviewClass06;

public class Students {
	/*
	 * Create a Class called Students Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 */

	String studentName;
	int studentid;
	static int numberofStudents;

	void printDetails() {
		System.out.println("Name is: " + studentName + " & His ID is: " + studentid);
	}

	public static void main(String[] args) {

		Students stu1 = new Students();
		stu1.studentName = "Alex";
		stu1.studentid = 22;
		numberofStudents++;

		Students stu2 = new Students();
		stu2.studentName = "John";
		stu2.studentid = 23;
		numberofStudents++;

		Students stu3 = new Students();
		stu3.studentName = "Mike";
		stu3.studentid = 24;
		numberofStudents++;

		System.out.println("total number of students is: " + numberofStudents);
		stu1.printDetails();
		stu2.printDetails();
		stu3.printDetails();
	}

}
