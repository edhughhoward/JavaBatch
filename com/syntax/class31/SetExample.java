package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String [] args) {
		
		HashSet<String> brand = new HashSet<>();
		brand.add("Nike");
		brand.add("Addidas");
		brand.add("H&M");
		brand.add("Zara");
		brand.add("Uniqlo");
		brand.add("Addidas");
		brand.add("H&M");
		
		System.out.println(brand.size());
		System.out.println(brand);
		
		// How to verify if an element is there
		boolean isItThere = brand.contains("Nike");
		System.out.println(isItThere);
		
		// How to access element from a Set collection
		// brand.get is not available in the set type
		
		Iterator<String> it = brand.iterator();
		String obj = it.next();
		System.out.println(obj);
		
		System.out.println("======================");
		while (it.hasNext()) {
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println("=========");
		
		// if we need to iterate over entire collection, we need a new object
		
		Iterator<String> it2 = brand.iterator();
		while (it2.hasNext()) {
			
			System.out.println(it2.next());
		
	}
		System.out.println("==============");
		for(String br : brand) {
			System.out.println(br);
		}
	System.out.println("=================");	
		LinkedHashSet<String> luxBrand = new LinkedHashSet<>();
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		
		System.out.println(luxBrand.size());
		System.out.println(luxBrand);
		
		System.out.println("====================");
		TreeSet<String> all = new TreeSet<>(brand);
		all.addAll(brand);
		all.addAll(luxBrand);
		System.out.println(all);
		System.out.println("=================");
		Iterator<String> it3 = all.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		Set<Double> tset = new TreeSet<>();
		tset.add(10.99);
		tset.add(1.99);
		tset.add(1000.99);
		tset.add(10.01);
		tset.add(110.99);
		
		System.out.println(tset);
		
		
}
}
