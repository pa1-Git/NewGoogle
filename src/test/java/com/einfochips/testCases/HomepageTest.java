package com.einfochips.testCases;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.einfochips.pageObjects.Homepage;

public class HomepageTest extends Base {

	public Homepage hp;
	Logger log = Logger.getLogger(HomepageTest.class);
	
	
	@BeforeClass
	public void launch() {
		hp = new Homepage(BaseDriver);
		log.info("DONE");
	}

	@Test
	public void Services() {
		hp.clickGmail();
		// new comment in homepagetest cls
		Assert.assertTrue(true);
	}

}
