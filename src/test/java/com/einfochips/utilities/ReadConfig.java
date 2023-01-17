package com.einfochips.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public Properties cProp;

	public ReadConfig() {
		File src = new File("./ConfigurationFiles\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			cProp = new Properties();
			cProp.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getBrowser() {
		String browser = cProp.getProperty("Browser");
		return browser;
	}

}
