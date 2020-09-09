package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {

		String xlpath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx"; // Step 1.

		FileInputStream fis = new FileInputStream(xlpath);// Step 2.

		Workbook book = new XSSFWorkbook(fis);// Step 3.
		Sheet sheet = book.getSheet("Sheet1");// Step 4.
		sheet.getRow(0).createCell(5).setCellValue("Result");// Step 5.
		sheet.getRow(1).createCell(5).setCellValue("Pass");
		sheet.getRow(2).createCell(5).setCellValue("Fail");
		sheet.createRow(3).createCell(0).setCellValue("Done");// Step 6.

		String newFile = System.getProperty("user.dir") + "/testdata/Results.xlsx";// Step 7.
		FileOutputStream fos = new FileOutputStream(newFile);// Step 8.
		book.write(fos);// Step .
	}

}
