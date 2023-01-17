package com.einfochips.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Reporting implements ITestListener {

	public static ExtentReports extent;
	public ExtentReportManager ER;
	public UtilityCodes utils;

	@Override
	public void onStart(ITestContext context) {
		ER = new ExtentReportManager();
		utils = new UtilityCodes();
		extent = ER.extentReports();// calling extent report logic from ExtentReport class

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest testLog = extent.createTest(result.getMethod().getMethodName());
		testLog.pass("S");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {

	 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

}
