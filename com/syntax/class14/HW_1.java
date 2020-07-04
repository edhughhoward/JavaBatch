package com.syntax.class14;

public class HW_1 {

	public static void main(String[] args) {

		String day = "Sunday";
		String newString = "";
	for (int i = day.length() -1; i >= 0; i--) {
		char letters = day.charAt(i);
		newString += day.charAt(i);
	}
	System.out.println(newString);
	
	String day2 = "Sunday";
for (int i = day2.length() -1; i >= 0; i--) {
	System.out.print(day2.charAt(i));
	}

}
}
