package com.syntax.class14;

public class HW_2 {

	public static void main(String[] args) {

		
		String str = "He";
		
		int size = str.length();
	
		if (!str.isEmpty()) {
			if (size >=3) {
				if (size % 2 !=0){
				int print = (size /2);
			System.out.println(str.charAt(print));
		} else {
			System.out.println("This string has an even number of characters");
		}
	} else {
		System.out.println("This string has less than 3 characters");
	}
		
}
	}
		
	}


