package com.syntax.repl5;

public class Main2 {

	static final double avgElements (int[] a) {
		double sum = 0;
		
		for (int i:a) {
			sum +=i;
		}
		double average = sum / a.length;
		return average;
	}
	public static void main(String [] args) {
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a));
	}
}
