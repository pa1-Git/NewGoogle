package com.einfochips.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityCodes {

	// screenshot

	public void captureScreen(WebDriver driver, String methodName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "Screenshots" + methodName + ".png");
		try {
			FileUtils.copyFile(src, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screen captured");
	}

}
