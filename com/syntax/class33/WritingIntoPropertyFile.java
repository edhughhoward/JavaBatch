package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {

	public static void main(String [] args) throws IOException {
		
		String file = "configs//Example.properties";
		// input - pulling from properties 
		FileInputStream fis = new FileInputStream(file);
		// connection has been created
		Properties prop = new Properties();
		prop.load(fis);
		// adding keys 
		prop.setProperty("Street", "New Brook Drive");
		// connecting added keys to the property file
		String newFile = "configs//NewFile.properties";// doing this will create a new file in configs
		
		FileOutputStream fos = new FileOutputStream(newFile);
		prop.store(fos, "Added additional key");
		
	}
}
