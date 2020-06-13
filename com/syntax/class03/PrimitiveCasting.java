package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
		double d = 7;
		System.out.println(d);
				
		int i = (int) 7.58; //compile time error: type mismatch, can not conver from double to int
		System.out.println(i);
		
		byte b = (byte) 123865;
		System.out.println(b);
		
		
		
		
	}
}
