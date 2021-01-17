package com.TestNGBasicFeatures;

import org.testng.annotations.Test;

// 1. Grouping in TestNG let multiple Test methods to Group with Single Group Name.
// 2. Using XML file help Play with this grouping with the Keywords Exclude and Include which allows to run specific groups and ignore others
//  TestNG allows allows Grouping of Groups know as Meta Groups (Reiterate while working with XML)
public class GroupingSampleTest {
	
	
	@Test(groups = {"Smoke Test"})
	public void STest1(){
		System.out.println("Group: Smoke Test && Test: 1" );
		System.out.println(1/0);
	}
	
	@Test(groups = {"Smoke Test"})
	public void STest2(){
		System.out.println("Group: Smoke Test && test: 2" );
	}
	
	
	@Test(groups = {"Functional Test"})
	public void FTest1(){
		System.out.println("Group: Functional Test && Test: 1" );
	}
	
	@Test(groups = {"Functional Test"})
	public void FTest2(){
		System.out.println("Group: Functional Test && test: 2" );
	}
	
	@Test(groups = {"Functional Test", "Smoke Test"})
	public void SFTest1(){
		System.out.println("Group: Functional n Smoke Test && Test: 1" );
	}
	
	@Test(groups = {"Functional Test", "Smoke Test"})
	public void SFTest2(){
		System.out.println("Group: Functional n Smoke Test && test: 2" );
	}
	

}
