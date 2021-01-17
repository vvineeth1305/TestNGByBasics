package com.TestNGListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TestNGBasicFeatures.Base;

public class ScreenShotListener extends Base implements ITestListener{
	
	
	 public void onTestStart(ITestResult result) {
		    // not implemented
		  }

		  
		  public void onTestSuccess(ITestResult result) {
		    // not implemented
		  }

		  public void onTestFailure(ITestResult result) {
		    
			  System.out.println("Test Failed");
			  try {
				TakeScreenShot(result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		  }

		  
		  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }

		 
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

		  
		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		  
		  public void onStart(ITestContext context) {
		    // not implemented
		  }

		  
		  public void onFinish(ITestContext context) {
		    // not implemented
		  }
}
