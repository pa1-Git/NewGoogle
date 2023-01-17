package com.einfochips.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.einfochips.utilities.ExtentReportManager;
import com.einfochips.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver BaseDriver;
	
	
	
	@Parameters({ "tester", "env" })
	@BeforeTest
	public void setup(String tester, String env) {
		ReadConfig rc = new ReadConfig();
		
		
		if (rc.getBrowser().equalsIgnoreCase("chrome")) {
			BaseDriver = WebDriverManager.chromedriver().create();
		} else if (rc.getBrowser().equalsIgnoreCase("firefox")) {
			BaseDriver = WebDriverManager.firefoxdriver().create();
		} else if (rc.getBrowser().equalsIgnoreCase("edge")) {
			BaseDriver = WebDriverManager.edgedriver().create();
		}

		BaseDriver.manage().window().maximize();
		BaseDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		BaseDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		BaseDriver.get("https://www.google.com/");

		System.out.println("Tester is " + tester + " execution in '" + env + " 'environemtn");
		// log cofigs

	}

	@AfterTest
	public void tearDown() {
		BaseDriver.quit();
	}

}
