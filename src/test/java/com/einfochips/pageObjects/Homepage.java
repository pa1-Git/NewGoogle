package com.einfochips.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver homepageDriver;
	
	public Homepage(WebDriver driver) {
		homepageDriver = driver;
		PageFactory.initElements(homepageDriver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Gmail')]")
	WebElement gmail;

	public void clickGmail() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		gmail.click();
 	}

}
