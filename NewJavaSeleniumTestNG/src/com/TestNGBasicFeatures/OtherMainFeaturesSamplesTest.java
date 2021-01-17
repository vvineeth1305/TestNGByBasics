package com.TestNGBasicFeatures;

import org.testng.annotations.Test;

// 1.InvocationCount attribute help execute same method N number of times using.
// 2. Timeout attribute help halt the particular test after x milliseconds and mark as Failed 

public class OtherMainFeaturesSamplesTest {
	
	
	
	@Test(invocationCount = 10)
	
	public void InvocationCountSample()
	{
		
		System.out.println("Invocation Test");
	}

	/*
	 * @Test(timeOut = 1000) public void InfiteLoop() { int i = 1; while(i==1) {
	 * System.out.println(i); } }
	 */
	@Test(expectedExceptions = ArithmeticException.class)
	public void ArthematicExceptionSample()
	{
		System.out.println(1/0);
	}
	
}
