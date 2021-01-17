package com.TestNGBasicFeatures;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.TestNGListeners.ScreenShotListener.class)
public class ScreenshotTest extends Base{
	
	
	@BeforeMethod
	public void SetUP()
	{
		Initialization();
	}
	
	@Test
	public void Test1() {
		
		Assert.assertEquals(true, false);
	}

	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}


