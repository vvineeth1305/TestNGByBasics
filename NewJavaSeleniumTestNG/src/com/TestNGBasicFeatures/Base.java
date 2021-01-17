package com.TestNGBasicFeatures;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.OutputDeviceAssigned;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static String basePath = "C:\\Users\\Vineeth V\\eclipse-workspace\\NewJavaSeleniumTestNG";

	public static void Initialization() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vineeth V\\eclipse-workspace\\NewJavaSeleniumTestNG\\Libs1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public  void TakeScreenShot(String MethodName) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File desFile = new File(basePath+"//FailedScreenShots"
//				+ "//"+this.getClass().getName()+"_"+timestamp+".png");
				+ "//"+MethodName+"_"+timestamp+".png");
		FileUtils.copyFile(scrFile, desFile);
	}

}
