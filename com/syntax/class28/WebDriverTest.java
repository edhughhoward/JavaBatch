package com.syntax.class28;

public class WebDriverTest {
public static void main(String[] args) {
	
	RemoteWebDriver s1 = new ChromeDriver();
	s1.getScreenshot();
	s1.navigate();
	s1.open();
	s1.close();
	System.out.println(s1.getTitle());
	
	RemoteWebDriver s2 = new FirefoxDriver();
	s2.getScreenshot();
	s2.navigate();
	s2.open();
	s2.close();
	System.out.println(s2.getTitle());
	
	RemoteWebDriver s3 = new SafariDriver();
	s3.getScreenshot();
	s3.navigate();
	s3.open();
	s3.close();
	System.out.println(s3.getTitle());
	System.out.println("=========starts array enhanced============");
	RemoteWebDriver[] drivers = {new SafariDriver(),new FirefoxDriver(), new ChromeDriver()};
	
	for (RemoteWebDriver d :drivers) {
		d.getScreenshot();
		d.navigate();
		d.open();
		d.close();
		System.out.println(d.getTitle());
		System.out.println("==========");
	}
}
}
