package com.TestNGBasicFeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	// Each annotation should be associated with 1 method.
// pre condition annotation start with @before
	@BeforeSuite

	public void SetSystemProperties() {

		System.out.println("We are in -> @BeforSuite function --> Set System Properties");
	}

	@BeforeTest
	public void LauchBrowser() {

		System.out.println("We are in -> @BeforeTest Method  --> Launch Browser");
	}

	@BeforeClass
	public void EntertheURL() {

		System.out.println("We are in -> @BeforeClass function --> Enter URL");
	}

	@BeforeMethod
	public void Login() {

		System.out.println("We are in -> @BeforeMethod function --> Login");
	}

//test cases -- start with @test annotations

	@Test
	public void verifyHomePageTitle() {

		System.out.println("We are in -> @actual Test function --> Verify HomePage");
	}
//Post condition - Starts with @After 

	@AfterMethod
	public void Logout() {

		System.out.println("We are in -> @AfterMethod function --> Logout");
	}

	@AfterClass
	public void deleteCookies() {

		System.out.println("We are in -> @AfterClass function  --> delete Cookies");
	}

	@AfterTest
	public void closetheBrowser() {

		System.out.println("We are in -> @AfterTest function --> close Browser");
	}

	@AfterSuite
	public void generateReport() {

		System.out.println("We are in -> @AfterSuite function --> Generate Report");
	}

}
