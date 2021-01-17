package com.TestNGBasicFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.TestNGBasicFeatures.Base;

public class ParameterTest extends Base {
	
	WebDriver driver;
	
	@Test
	@Parameters({"URL", "UserName"})
	public void loginYahoo(String URL,String UserName) {
		Initialization();
		driver.get(URL);
		driver.findElement(By.xpath("//input[@id = 'login-username']")).clear();
		driver.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys(UserName);
		
	}

}
