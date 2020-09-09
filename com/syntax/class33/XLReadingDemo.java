package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadingDemo {

	public static void main(String [] args) throws IOException {
		
	String xlpath = System.getProperty("user.dir")+ "/testdata/SampleTestData.xlsx"; //1
		
		FileInputStream fis = new FileInputStream(xlpath); //2
		
		Workbook workbook = new XSSFWorkbook(fis);//3
		Sheet sheet = workbook.getSheet("Sheet1");//4
		Row row1 = sheet.getRow(0);//5
		Cell row1cell3 = row1.getCell(2);//6
		String value = row1cell3.toString();//7
		System.out.println(value);//7
		
		System.out.println("====another way to get cell ====");
		Row row2 = sheet.getRow(1);
		String row2cell1 = row2.getCell(0).toString();
		System.out.println(row2cell1);
		
		
	}
}
