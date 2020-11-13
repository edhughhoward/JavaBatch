package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardCodedExamples {

	/*
	 * REST Assured - Java Library specifically used developed to automate REST
	 * endpoints
	 * 
	 * Given = preparing your request When = what action will you perform, what type
	 * of call are you making? Then = verification
	 * 
	 * 
	 */

	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM2MzYxODQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzY3OTM4NCwidXNlcklkIjoiMjE3MyJ9.UrI68VT1IWONNjV2eSXHq0WrpdqYirDidqsfKOIiR84";
	static String employeeID;
	static String empID;

	// @Test
	public void sampleTest() {
		// baseURI is the same as baseURL

		/** BaseURI for all endpoints */
		// RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

		/** Creating JWT **/
		// String token = "Bearer
		// eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM1NTgxNjAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzYwMTM2MCwidXNlcklkIjoiMjE2NCJ9.mSapxZ8V_zgO49DwpqBVJnPPerWA1fUTEIfEVubXde8";

		/** Preparing request for /getOneEmployee.php **/
		/** using .log.all() to print out everything being sent with the request **/
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParams("employee_id", "27926A");

		/** Making a call to /getOneEmployee.pho **/
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

		/** Using rest assured **/
		getOneEmployeeResponse.prettyPrint();

		/** printing with syso **/
		System.out.println(getOneEmployeeResponse.asString());

		getOneEmployeeResponse.then().assertThat().statusCode(200);

	}

	@Test
	public void aPostCreateEmployee() {
		RequestSpecification createEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\r\n" + "  \"emp_firstname\": \"Sorina\",\r\n" + "  \"emp_lastname\": \"Cristian\",\r\n"
						+ "  \"emp_middle_name\": \"B\",\r\n" + "  \"emp_gender\": \"F\",\r\n"
						+ "  \"emp_birthday\": \"1987-01-20\",\r\n"
						+ "  \"emp_status\": \"Independent contractor\",\r\n"
						+ "  \"emp_job_title\": \"Cloud Architect\"\r\n" + "}");

		/** making a call to /createEmployee.php **/
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

		/** printing a rest assured response **/
		// createEmployeeResponse.prettyPrint();

		/** traversing the from json and storing the employee ID into a string **/
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
		// System.out.println(employeeID);

		createEmployeeResponse.then().assertThat().statusCode(201);

		/**
		 * Making sure that the message is being displayed correctly. Message is paired
		 * with Entry Created
		 **/
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));

		/** Verifying created employee first name **/
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("Sorina"));

		/** Verifying server Apache/2.4.39 (Win64) PHP/7.2.18 **/
		// createEmployeeResponse.then().header(headerName, expectedValueMatcher));

	}

	@Test
	public void bGetCreatedEmployee() {
		// System.out.println("===================================================================");

		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParams("employee_id", employeeID);

		/** Making a call to /getOneEmployee.php **/
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

		/** Using rest assured **/
		// getOneEmployeeResponse.prettyPrint();

		/** printing with syso **/
		// System.out.println(getOneEmployeeResponse.asString());

		String empID = getOneEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");

		boolean verifyingEmployeeID = empID.equalsIgnoreCase(empID);

		Assert.assertTrue(verifyingEmployeeID);

		getOneEmployeeResponse.then().statusCode(200);

		// Getting the whole response as a string
		String response = getOneEmployeeResponse.asString();

		JsonPath js = new JsonPath(response);
		// System.out.println("===========================================");
		String employeeId = js.getString("employee[0].employee_id");
		String empFirstName = js.getString("employee[0].emp_firstname");
		String empMiddleName = js.getString("employee[0].emp_middle_name");
		String empLastName = js.getString("employee[0].emp_lastname");
		String empBirthday = js.getString("employee[0].emp_birthday");
		String empGender = js.getString("employee[0].emp_gender");
		String empJobTitle = js.getString("employee[0].emp_job_title");
		String empStatus = js.getString("employee[0].emp_status");

		// 1st Way
		boolean verifyingEmpID = employeeId.equalsIgnoreCase(employeeID);
		Assert.assertTrue(verifyingEmpID);

		// 2nd Way
		Assert.assertTrue(employeeId.equalsIgnoreCase(employeeID));

		// 3rd Way
		Assert.assertEquals(empFirstName, "Sorina");
		Assert.assertEquals(empMiddleName, "B");
		Assert.assertEquals(empLastName, "Cristian");
		Assert.assertEquals(empBirthday, "1987-01-20");
		Assert.assertEquals(empGender, "Female");
		Assert.assertEquals(empJobTitle, "Cloud Architect");
		Assert.assertEquals(empStatus, "Independent contractor");
		// System.out.println("=========================================================");
	}

//	@Test
//	public void cGETallEmployees() {
//	
//
//		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");
//
//		// Printing a response
//		// getAllEmployeesResponse.prettyPrint();
//
//		String response = getAllEmployeesResponse.asString();
//
//		// creating object of JsonPath and passing response as a string as an argument
//		JsonPath js = new JsonPath(response);
//
//		// printing the count of all the employees
//		int count = js.getInt("Employees.size()");
//		// System.out.println(count);
//
//		/*
//		 * for (int i =0; i<count; i++) { String allEmpId = js.getString("Employees[" +
//		 * i + "].employee_id");
//		 * 
//		 * if(allEmpId.contentEquals(employeeID)) { System.out.println("Employee ID: " +
//		 * employeeID + "ispresent in the body"); String firstnameofempid =
//		 * js.getString("Employees[" + i + "].emp_firstname");
//		 * System.out.println(firstnameofempid); break; }
//		 * 
//		 * }
//		 */
//
//		/*
//		 * for(int i =0; i<count; i++) { String allFirstNames =
//		 * js.getString("Employees[" + i + "].emp_firstname");
//		 * System.out.println(allFirstNames); }
//		 */
//	}

	@Test
	//preparing the responsee 
	public void dPUTUpdateCreatedEmployee() {
		RequestSpecification preparingupdateEmployeeRequest = given()
				.header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\r\n" + 
						"  \"employee_id\": \""+employeeID+"\",\r\n" + 
						"  \"emp_firstname\": \"Ed\",\r\n" + 
						"  \"emp_lastname\": \"AKCAY\",\r\n" + 
						"  \"emp_middle_name\": \"B\",\r\n" + 
						"  \"emp_gender\": \"F\",\r\n" + 
						"  \"emp_birthday\": \"1993-02-16\",\r\n" + 
						"  \"emp_status\": \"Independent contractor\",\r\n" + 
						"  \"emp_job_title\": \"Cloud Architect\"\r\n" + 
						"}");

	
	//Storing the response into "preparingupdateResponse"	
	Response preparingupdateResponse = preparingupdateEmployeeRequest.when().put("/updateEmployee.php");
	
	//Printing the response 
	preparingupdateResponse.prettyPrint();
	
	//Storing the response into a string
	String response = preparingupdateResponse.asString();
	
	//Creating object of JS
	JsonPath js = new JsonPath(response);
	
	//Using JS getting the employee information 
	String employeeId = js.getString("employee[0].employee_id");
	String empFirstName = js.getString("employee[0].emp_firstname");
	String empMiddleName = js.getString("employee[0].emp_middle_name");
	String empLastName = js.getString("employee[0].emp_lastname");
	String empBirthday = js.getString("employee[0].emp_birthday");
	String empGender = js.getString("employee[0].emp_gender");
	String empJobTitle = js.getString("employee[0].emp_job_title");
	String empStatus = js.getString("employee[0].emp_status");
	
	//Validation 
	Assert.assertTrue(employeeId.contentEquals(employeeID));
	Assert.assertEquals(empFirstName, "Ed");
	Assert.assertEquals(empMiddleName, "B");
	Assert.assertEquals(empLastName, "AKCAY");
	Assert.assertEquals(empBirthday, "1993-02-16");
	Assert.assertEquals(empGender, "Female");
	Assert.assertEquals(empJobTitle, "Cloud Architect");
	Assert.assertEquals(empStatus, "Independent contractor");

}}
