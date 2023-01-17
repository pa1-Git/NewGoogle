package com.einfochips.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	public ExtentReports extentReports() {

		// Timestamp
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String reportName = "//Google report" + timestamp + "Reports.html";
		// This supports Extent report version 4
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter(System.getProperty("user.dir") +"//Reports" +reportName);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);// Attach the reporter
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "SAI");

		htmlreporter.config().setDocumentTitle("GOOGLE REPORTS");

		return extent;

	}

}
