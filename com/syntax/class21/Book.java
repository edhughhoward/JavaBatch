package com.syntax.class21;

public class Book {

	String name;
	int number;
	int pages;
	
	Book(){
		System.out.println("I like to read");
	}
	
	Book(String name, int number, int pages) {
		this();
		this.name = name;
		this.number = number;
		this.pages = pages;
	}
	
	void displayInfo() {
		System.out.println("The book name is: " + name + " it is #: " + number + " and it has: " + pages + " pages");
	}
	
	public static void main(String[] args) {
		Book obj = new Book("To Kill a Mocking Bird", 1, 150);
		obj.displayInfo();
	}
	

	
}
