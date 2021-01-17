package com.TestNGBasicFeatures;

import org.testng.annotations.Test;

// 1. Priority in TestNG is applicable only for @Test annotation
// 2. It allows both positive and negative values.
// 3. We can't assign multiple priorities to same test but we can assign same priority value to multiple test which will be order based on method name
// 4. Its not mandatory to add priorities in sequence.
// 5. TestNG will add 0 as Priority to Skipped Methods
// 6. Priority can't be assigned from XML file.
// 7. TestNG run method Priority by priority instead of class by class
   // Eg: C1M1, C2M1, C3M1, C1M2, C2M2 ........


public class PrioritySampleTest {
	
	@Test(priority =0)
	public void PriorityZero() {
		
		System.out.println("Priority value : 0");
	}
	
	@Test
	public void ZNoPriorityTag() {
		
		System.out.println("Z(to verify method name Sequence) No Priority Value");
	}
	
	@Test(priority = 3)
	public void PositivePrioritythree() {
		
		System.out.println("Priority value : 3");
	}
	
	@Test(priority = 2)
	public void DPositivePrioritytwo() {
		
		System.out.println("Priority value : 2 with D in method Name");
	}
	
	
	@Test(priority = 1)
	public void PositivePriorityone() {
		
		System.out.println("Priority value : 1");
	}
	
	@Test(priority = 2)
	public void PositivePrioritytwo() {
		
		System.out.println("Priority value : 2");
	}
	
	@Test(priority = -1)
	public void NegativePriorityone() {
		
		System.out.println("Priority value : -1");
	}
	
	@Test
	public void ANoPriorityTag() {
		
		System.out.println("A(to verify method name Sequence) No Priority Value");
	}
	
	
	@Test(priority = -2)
	public void NegativePrioritytwo() {
		
		System.out.println("Priority value : -2");
	}
	

}

// ************* Console Output  with descriptions********************

// Priority value : -2    -- > Least Negative value holds the highest priority
// Priority value : -1
// A(to verify method name Sequence) No Priority Value --> TestNG assigned priority 0 for skipped test and method name for ordering
// Priority value : 0  --> Test with ) priority will be compared with other test method names for ordering
// Z(to verify method name Sequence) No Priority Value --> TestNG assigned priority 0 for skipped test and method name for ordering
//Priority value : 1
//Priority value : 2
//Priority value : 2 with D in method Name --> Same priority assigned to multiple test will ordered based on method Name.
//Priority value : 3
 
// ************* End of Console Output ***************************



