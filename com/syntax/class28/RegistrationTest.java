package com.syntax.class28;

public class RegistrationTest {
public static void main(String[] args) {
	
	Registration s = new Registration();
	s.setEmail("ed@yahoo.com");
	s.setUsername("pioneers");
	s.setPassword("tuesday");
	System.out.println(s.getEmail());
	System.out.println(s.getUsername());
	System.out.println(s.getPassword());
}
}
