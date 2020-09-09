package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Task {
 public static void main(String[] args) throws IOException {
	
	 String filePath = "configs\\Example2.properties";
	 
	 FileInputStream fis = new FileInputStream(filePath);
	 
	 Properties prop = new Properties();
	 prop.load(fis);
	 System.out.println(prop.getProperty("browser"));
}
}
