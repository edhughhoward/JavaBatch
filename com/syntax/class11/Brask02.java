package com.syntax.class11;

public class Brask02 {
	public static void main(String[] args) {
		System.out.println("=============Enhanced for loop==========");
		String[] countries = { "Taj", "Brazil", "Gambia", "US" };

		for (String country : countries) {
			if (country.contentEquals("Albania")) {
				System.out.println("Tirana");
			} else if (country.contentEquals("Brazil")) {
				System.out.println("Brasillia");
			} else if (country.equals("US") || country.contentEquals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("Taj")) {
				System.out.println("Dushanbe");
			} else if (country.equalsIgnoreCase("Gambia")) {
				System.out.println("Banjul");
			} else {
				System.out.println("The country " + country + " is not on my list");
			}
		}
	}
}
