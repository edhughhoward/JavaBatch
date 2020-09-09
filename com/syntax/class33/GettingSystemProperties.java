package com.syntax.class33;

public class GettingSystemProperties {

	public static void main(String[] args) {
		
		// \Users\edhug\eclipse-workspace\JavaBasics\configs\Example.properties
		
		String user = System.getProperty("user.name");
		System.out.println(user);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String tz = System.getProperty("user.dir");
		System.out.println(tz);
		
	}
}
