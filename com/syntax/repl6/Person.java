package com.syntax.repl6;

public class Person {

	private String firstname, lastname, birthmonth, ssn;
	private int birthday, birthyear;

	public Person(String firstname, String lastname, String birthmonth, int birthday, int birthyear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.ssn = ssn;
		this.birthday = birthday;
		this.birthyear = birthyear;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public String getBirthmonth() {
		return birthmonth;
	}

	public String getSsn() {
		return ssn;
	}

	public int getBirthday() {
		return birthday;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public String formatBirthday() {
		String strbday = "";
		System.out.println(birthmonth + "/" + birthday + "/" + birthyear);
		return strbday;
	}
}
