package com.syntax.class11;

public class RetrieveValues2DaArray {
public static void main(String [] args) {
	
	String[][] months = {
			{"December", "January", "February"},
			{"March", "April", "May"},
			{"June", "July", "August"},
			{"September", "October", "November"}
	
			};
	int rows = months.length; // gives how many rows/arrays 
	System.out.println(rows + " seasons");
	
	int winter = months[0].length; // gives how many columns 
	System.out.println(winter + " months in winter");
	
	int spring = months[1].length;
	System.out.println(spring + " months in spring");
	
	int summer = months[2].length;
	System.out.println(spring + " months in summer");
	
	int fall = months[3].length;
	System.out.println(spring + " months in fall");
	
	int lastRowSize = months[rows-1].length;
	System.out.println("====");
	for (int row =0; row < months.length; row++) {
		for (int col =0; col < months[row].length; col++) {
		System.out.println(months[row][col]);
		}
	}
}


}
