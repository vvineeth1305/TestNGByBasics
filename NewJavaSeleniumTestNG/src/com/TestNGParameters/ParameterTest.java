package com.TestNGParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"URL", "UserName"})
	public void loginYahoo(String URL,String UserName) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vineeth V\\eclipse-workspace\\NewJavaSeleniumTestNG\\Libs1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.xpath("//input[@id = 'login-username']")).clear();
		driver.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys(UserName);
		
	}

}
