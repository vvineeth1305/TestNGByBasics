package com.TestNGBasicFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest extends Base {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		Initialization();
		driver.get("https://www.google.com");
	}

	@Test
	public void googleTitleTest() {
		
		String Title = driver.getTitle();
		System.out.println(Title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
