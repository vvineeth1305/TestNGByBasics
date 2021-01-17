package com.TestNGBasicFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// *********** Various assertions Statements *****************




public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vineeth V\\eclipse-workspace\\NewJavaSeleniumTestNG\\Libs1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
