package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {
	String dbUsername ="syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:mysql://hostname:portnumber/dbname
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
	@Test
	public void dbMetaData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		DatabaseMetaData dbMetaData = conn.getMetaData();
		String dname = dbMetaData.getDriverName();
		String dversion = dbMetaData.getDatabaseProductVersion();
		
		System.out.println(dname);
		System.out.println(dversion);
	}
	@Test
	public void resultsSetMetaData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employees where employee_id = 8392");

		ResultSetMetaData data = rs.getMetaData();
		int colcount = data.getColumnCount();
		System.out.println(colcount);
		String firstColName = data.getColumnName(1);
		System.out.println(firstColName);
		
		for (int i = 1; i <= colcount; i++) {
			String colNames = data.getColumnName(i);
			System.out.println(colNames);
		}
		
		
	}
}
