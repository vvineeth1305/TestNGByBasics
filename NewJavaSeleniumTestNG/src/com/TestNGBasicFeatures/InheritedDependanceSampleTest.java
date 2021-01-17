package com.TestNGBasicFeatures;

import org.testng.annotations.Test;

public class InheritedDependanceSampleTest  extends DependsSampleTest{
	@Test(dependsOnGroups = "Smoke")
	public void InheritedMethod() {
		System.out.println("Inherited Method");
	}

}
