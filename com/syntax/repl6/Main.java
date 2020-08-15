package com.syntax.repl6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");

		System.out.println(countries);

		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			String c = it.next();
			if (c.equals("Armenia") || c.equals("Australia") || c.contentEquals("Azerbaijan")) {
				it.remove();
			}
		}
		System.out.println(countries);
	}
}
