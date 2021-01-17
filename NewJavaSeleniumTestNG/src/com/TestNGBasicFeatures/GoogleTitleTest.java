package com.TestNGBasicFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// *********** Various assertions Statements *****************




public class GoogleTitleTest extends Base{

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
		Assert.assertEquals(Title, "Google","Title didnt Match");
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
