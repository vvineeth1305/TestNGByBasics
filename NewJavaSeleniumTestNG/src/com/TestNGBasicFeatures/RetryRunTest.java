package com.TestNGBasicFeatures;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class RetryRunTest {
	
	@Test(retryAnalyzer = com.TestNGListeners.RetryAnalyzer.class)
	public void sampleTest1() {
		Assert.assertEquals(3, 5, "values are different");
	}
	
	@Test
	public void sampleTest2(){
		Assert.assertEquals('a', 'f');
	}

}
