package com.syntax.class14;

public class StringMethodpt3 {
public static void main (String [] args) {
	
	System.out.println("===================.charAt() method====================");
	
	String season = "Summer";
	
	char character = season.charAt(4);
	System.out.println(character);
	
	System.out.println("===================.indexOf() method====================");
	
	int index = season.indexOf('m', 3);
	System.out.println(index);
	String hello = "Hello Ksenia";
	int indexOfK = hello.indexOf("Ksenia");
			System.out.println(indexOfK);
	
	System.out.println("===================.substring() method====================");

	String message = "You guys are awesome";
	String newMessage =message;
	System.out.println(newMessage);
	String partfromString = message.substring(4);
	System.out.println(partfromString);
	
	String middle = message.substring(4, 8);
	System.out.println(middle);
	
	


}
}
