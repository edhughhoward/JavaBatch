package com.syntax.class14;

public class StringMethods {

	public static void main(String[] args) {
			//1st way to create a string most popular
			String name = "Olga"; //literal declaration
			
			//2nd way to create string
			String name1 = new String(); 
			name1 = "Olga";
			
			System.out.println(name);
			System.out.println(name1);
		
			// methods of string class
			String school = "Syntax";
			
			System.out.println("====================.length() method========================");
			// tells how many characters are in the string
			int size = school.length();
			System.out.println("The length of the String is = " + size);
		
			String greetings = "Hello Syntax";
			int sizeOfDifferentString = greetings.length();
			System.out.println(sizeOfDifferentString);
			
			System.out.println("====================.toUpperCase() method========================");
			
			String city = "Washington DC";
			String newCity = city.toUpperCase();
			System.out.println(newCity);
			
			System.out.println("====================.toLowerCase() method========================");
			
			String lowerCaseString = newCity.toLowerCase();
			System.out.println(lowerCaseString);
			
			System.out.println("====================.concat() method========================");
			
			String country = "USA ";
			String capital = "Washington DC";
			
			// "+" with Strings serves as concatenation operator
			// "+" with numbers serves as math operator
			
			System.out.println(country  + capital);
			System.out.println(country.concat(capital)); //only works if both are Strings
			
			int day = 27;
			String month = "June";
			
			System.out.println(day + month);
			System.out.println(month + day);
			System.out.println("====================.isEmpty() method========================");
			// checks to see if the string is empty
			String str = "Hello";
			boolean isEmpty = str.isEmpty();
			
			System.out.println(isEmpty);
			
			System.out.println("====================.trim() method========================");
			//remove empty spaces before and after only
			String cat = "Jessy   ";
			String dog = "  d         Charlie    ";
			
			System.out.println(cat);
			System.out.println(dog);
			System.out.println(cat.trim());
			System.out.println(dog.trim());
			
			
	}

}
