package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {

	public static void main(String[] args) throws IOException {

		String xlpath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlpath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sheet1");

		String value = sheet.getRow(1).getCell(3).toString();
		System.out.println(value);
		// how to get values from all rows and columns
		// 1. get number of rows
		int rows = sheet.getPhysicalNumberOfRows();

		// 2. get number of columns
		int cols = sheet.getRow(0).getLastCellNum();

		// 3. use nested for loop to print all values
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				String answer = sheet.getRow(r).getCell(c).toString();
				System.out.print(answer + " ");
			}
			System.out.println();
		}

	}
}
