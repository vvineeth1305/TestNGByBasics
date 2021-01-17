package com.TestNGListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int retrycount = 3;
	int counter =0;
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter<retrycount) {
			counter++;
			return true;
		}
		return false;
	}

}
