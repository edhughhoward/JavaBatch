package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	public static void main(String[] args) throws IOException {
		// STEP 1 IDENTIFY PATH FILE YOU WOULD LIKE TO READ
		String filePath = "configs\\Example.properties"; // 1
		
		// STEP 2 create an object of the FileInputStrem class
		FileInputStream fis = new FileInputStream(filePath); //2
		
		// STEP 3 to work with property file we use Properties class in Java
		Properties prop= new Properties(); // 3
		prop.load(fis); //4 only use this if it is an existing file.  If new file, .load is not needed
		String value = prop.getProperty("city");
		System.out.println(value);
		
		System.out.println(prop.getProperty("company"));
	}
}
