package com.TestNGBasicFeatures;

import org.testng.annotations.Test;

// dependsON Attribute can be used on Test Annotations using dependsOnMethods in @TestAnnotation and also on groups using dependsOnGroups

// dependsOnMethods can be applied as below 
// 1. dependsOnMethods- Single
// 2. dependsOnMethods- Multiple
// 3. dependsOnMethods-Inherited

public class DependsSampleTest {
	
	
	@Test(groups = "Smoke")
	public void OpenBrowser() {
		System.out.println("Open Browser");
		//System.out.println(1/0);
	}
	
	@Test(groups = "Smoke",dependsOnMethods = {"OpenBrowser"})
	public void loginTest() {
		System.out.println("Log in Test");
		//System.out.println(1/0);
	}
	
	
	@Test(groups = "Smoke",dependsOnMethods = {"loginTest","OpenBrowser"})
	public void HomePageTest() {
		System.out.println("Home Page Test");
		System.out.println(1/0);
	}
	
	@Test(dependsOnGroups = "Smoke")
	public void verifyTitle() {
		System.out.println("Verification");
	}

}
