package com.Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	/*
	 * TC 1: HRMS blank password validation Navigate to
	 * �http://166.62.36.207/humanresources/symfony/web/index� Enter valid username
	 * and leave password field empty Click on login button Verify error message
	 * with text �Password cannot be empty� is displayed TC 2: HRMS blank username
	 * and password validation Navigate to
	 * �http://166.62.36.207/humanresources/symfony/web/index� Leave username and
	 * password field empty Click on login button Verify error message with text
	 * �Username cannot be empty� is displayed TC 2: HRMS blank username and
	 * password validation Navigate to
	 * �http://166.62.36.207/humanresources/symfony/web/index� Enter valid username
	 * and wrong password Click on login button Verify error message with text
	 * �Invalid credentials� is displayed
	 */

	public static WebDriver driver;

	/*
	 * @method navigate to hrms website
	 * 
	 * @return driver
	 */
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://166.62.36.207/humanresources/symfony/web/index");


	}

	/*
	 * @method quits the browser
	 */
	public static void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}