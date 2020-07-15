package com.syntax.class22;

public class Employee {

	public static String company;
	protected String fullName;
	double salary;
	private long ssn;
	
	public void work() {
		System.out.println("I work");
	}
	public void getPaid() {
		System.out.println("I get paid a good amount");
	}
}
class ScrumTeam extends Employee {

	
	String ceremonies;
	
	void attendsMeetings() {
		System.out.println("I attend meetings");
	}
	void workOnSoftware() {
		System.out.println("we workd on building software");
	}
}
class ProductOwner extends ScrumTeam {

	void communication() {
		System.out.println("PO Communicates");
	}
	void prioritizePB() {
		System.out.println("PO Prioritizes the Product Backlog");
	}
}
class ScrumMaster extends ScrumTeam {

	void shieldTeam() {
		System.out.println("Protects team from outside distraction");
	}
	void doMeetings() {
		System.out.println("SM leads all the team meetings");
	}
}
class Developer extends ScrumTeam {
	
	void code() {
		System.out.println("Development Team writes all the codes");
	}

}
class Tester extends ScrumTeam {

	void test() {
		System.out.println("Tester tests all the code to make sure it works");
	}
}
class BusinessAnalyst extends ScrumTeam {

	void gatherReq() {
		System.out.println("BA gathers all the requirements needed for the project");
	}
}
