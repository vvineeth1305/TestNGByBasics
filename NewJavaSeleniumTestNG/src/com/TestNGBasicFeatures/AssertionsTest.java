package com.TestNGBasicFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {

	SoftAssert softAssert = new SoftAssert();

	@Test
	public void SoftAssertionNoAssertAll() {

		//SoftAssert softAssert = new SoftAssert();
		System.out.println("check point for Soft Assert Pass:");
		softAssert.assertEquals(true, true, "true & true");

		System.out.println("check point for Soft Assert Fail:");
		softAssert.assertEquals(true, false, "true & False");
		
		System.out.println("check point for Soft Assert Pass:");
		softAssert.assertEquals(true, true, "true & true");
		
		System.out.println("No softAssert collection- so No Fail");
		//softAssert.assertAll();
	}
	@Test
	public void SoftAssertionAssertAll() {

		//SoftAssert softAssert = new SoftAssert();
		System.out.println("check point for Soft Assert Pass:");
		softAssert.assertEquals(true, true, "true & true");

		System.out.println("check point for Soft Assert Fail:");
		//softAssert.assertEquals(true, false, "true & False");
		
		System.out.println("check point for Soft Assert Pass:");
		softAssert.assertEquals(true, true, "true & true");
		
		
		System.out.println("check point for Soft Assert Fail:");
		//softAssert.assertEquals(true, false, "true & False");
		
		softAssert.assertAll();
	}
	@Test
	public void HardAssertion() {

		System.out.println("check point for Soft Assert Pass:");
		Assert.assertEquals(true, true, "true & true");

		System.out.println("check point for Soft Assert Fail:");
		Assert.assertEquals(true, false, "true & False");
		
		System.out.println("check point for Soft Assert Pass:");
		Assert.assertEquals(true, true, "true & true");
	}

}
