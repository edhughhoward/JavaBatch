package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelIntoMap {
	public static void main(String[] args) throws IOException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);
		
		// creating an object of Workbook
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		// getting number of rows and columns
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		// creating an empty list
		List<Map<String, String>> xlList = new ArrayList<>();
		Map<String, String> map;
		//Loop over rows
		for (int r = 1; r < rows; r++) {
			//for every row create a new MAP
			map = new LinkedHashMap<>(); // is the same as Map<String, String> map = new LinkedHashMap<>();
			//loop over every column
			for (int c = 0; c < cols; c++) {
				//get keys from 1 row (header)
				String key = sheet.getRow(0).getCell(c).toString();
				// or: map.put(sheet.getRow(0).getCell(c).toString(), sheet.getRow(r).getCell(c).toString());
				//get values from other rows
				String value = sheet.getRow(r).getCell(c).toString();
				
				//store values from each cell of the row into a map
				map.put(key, value);
			}
			//add created map with values into List
			xlList.add(map);
		}
		System.out.print(xlList);
		
		for(Map<String, String> lmap:xlList) {
			System.out.println(lmap);
		}	
	}
}