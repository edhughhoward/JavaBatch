package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class CountryTest {
	public static void main(String[] args) {
		Country [] countr = {new USA("USA"),
				new Afghanistan("Afghanistan"),
				new Kazakhstan("Kazakhstan")};
		
		ArrayList<Country> countries = new ArrayList<>(); //storing user defined classes
		countries.add(new USA("USA"));
		countries.add(new Afghanistan("Afghanistan"));
		countries.add(new Kazakhstan("Kazakhstan"));
		System.out.println("===== Using for Loop=====");
		for(int i = 0; i < countries.size(); i++) {
			countries.get(i).election();
		}
		System.out.println("===== Using enhanced for loop=====");
		for(Country c: countries) {
		c.election();
		}
		System.out.println("===== Using Iterator=====");
		Iterator<Country> it = countries.iterator();
		while(it.hasNext()) {
			it.next().election();
		}
	}
}
