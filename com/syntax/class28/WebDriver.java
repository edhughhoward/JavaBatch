package com.syntax.class28;

public interface WebDriver {

	void open();
	void close();
	String getTitle();
	
	
}
interface TakesScreenshot {
	void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
	void navigate();
	
}
class ChromeDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Chrome is opening");
	}

	@Override
	public void close() {
		System.out.println("Chrome is closing");
	}

	@Override
	public String getTitle() {
		return "Chrome";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Chrome can get screenshot");
	}

	@Override
	public void navigate() {
		System.out.println("Chrome can navigate");
	}
}
class FirefoxDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Firefox is opening");
	}

	@Override
	public void close() {
		System.out.println("Firefox is closing");
	}

	@Override
	public String getTitle() {
		return "Firefox";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Firefox can get screenshot");
	}

	@Override
	public void navigate() {
		System.out.println("Firefox can navigate");
	}
}
class SafariDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("SafariDriver is opening");
	}

	@Override
	public void close() {
		System.out.println("SafariDriver is closing");
	}

	@Override
	public String getTitle() {
		return "SafariDriver";
	}

	@Override
	public void getScreenshot() {
		System.out.println("SafariDriver can get screenshot");
	}

	@Override
	public void navigate() {
		System.out.println("SafariDriver can navigate");
	}
}
