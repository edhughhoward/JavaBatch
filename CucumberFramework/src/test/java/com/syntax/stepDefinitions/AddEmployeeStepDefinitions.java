package com.syntax.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinitions extends CommonMethods {
	@Then("navigate to add employee page")
	public void navigate_to_add_employee_page() {
		click(dash.pimLinkBtn);
		click(dash.addEmpBtn);

	}

	/*
	 * // @Then("enter first and last name") public void enter_first_and_last_name()
	 * { sendText(addEmp.firstNameField, "John"); sendText(addEmp.lastName, "Wick");
	 * }
	 */

	@Then("click on save Button")
	public void click_on_save_Button() {
		click(addEmp.saveButton);
	}

	@Then("verify the employee is added successfully")
	public void verify_the_employee_is_added_successfully() {
		String profileName = persDetails.profileName.getText();
		Assert.assertEquals("John Wick", profileName);
	}

	/*
	 * @When("Enter first name {string} middle name {string} and last name {string}"
	 * ) public void enter_first_name_middle_name_and_last_name(String firstName,
	 * String middleName, String lastName) { sendText(addEmp.firstNameField,
	 * firstName); sendText(addEmp.middleName, middleName);
	 * sendText(addEmp.lastName, lastName);
	 * 
	 * }
	 */
	@Then("verify that {string} is added successfully")
	public void verify_that_is_added_successfully(String fullName) {
		String profileName = persDetails.profileName.getText();
		Assert.assertEquals(fullName, profileName);
	}

	/*
	 * @When("enter employee {string}, {string}, {string}") public void
	 * enter_employee(String firstName, String middleName, String lastName) {
	 * sendText(addEmp.firstNameField, firstName); sendText(addEmp.middleName,
	 * middleName); sendText(addEmp.lastName, lastName);
	 * 
	 * }
	 */

	@Then("verify that {string}, {string}, {string} is successfully added")
	public void verify_that_is_successfully_added(String firstName, String middleName, String lastName) {
		String fullName = firstName + " " + middleName + " " + lastName;
		String fullProfileName = persDetails.profileName.getText();
		Assert.assertEquals(fullName, fullProfileName);
	}

	@When("add multiuple employees adn verify they are added")
	public void add_multiuple_employees_adn_verify_they_are_added(DataTable employees) throws InterruptedException {
		List<Map<String, String>> employeeNames = employees.asMaps();

		for (Map<String, String> employeeName : employeeNames) {
			String firstName = employeeName.get("FirstName");
			String middleName = employeeName.get("MiddleName");
			String lastName = employeeName.get("LastName");
			String empId = employeeName.get("EmployeeID");

			sendText(addEmp.firstNameField, firstName);
			sendText(addEmp.middleName, middleName);
	//		sendText(addEmp.lastName, lastName);
			sendText(addEmp.idField, empId);

			click(addEmp.saveButton);

			String actualName = persDetails.profileName.getText();
			String expectedName = firstName + " " + middleName + " " + lastName;
			Assert.assertEquals("Verifying Employee names", expectedName, actualName);
			click(dash.addEmpBtn);
			Thread.sleep(1000);
		}
	}

	@When("add multiple employeed from {string} verify they are added successfully")
	public void add_multiple_employeed_from_verify_they_are_added_successfully(String sheetName) {
		List<Map<String, String>> excelData = ExcelUtility.excelToListMap(Constants.TESTDATA_FILEPATH, sheetName);

		for (Map<String, String> excepEmpName : excelData) {

			String firstName = excepEmpName.get("FirstName");
			String middleName = excepEmpName.get("MiddleName");
			String lastName = excepEmpName.get("LastName");
			String empId = excepEmpName.get("EmployeeID");
			
			sendText(addEmp.firstNameField, firstName);
			sendText(addEmp.middleName, middleName);
		//	sendText(addEmp.lastName, lastName);
			sendText(addEmp.idField, empId);

			click(addEmp.saveButton);

			String actualName = persDetails.profileName.getText();
			String expectedName = firstName + " " + middleName + " " + lastName;
			Assert.assertEquals("Verifying Employee names", expectedName, actualName);
			jsClick(dash.addEmpBtn);

		}
	}

}
