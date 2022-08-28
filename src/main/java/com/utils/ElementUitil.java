package com.utils;


import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;


public class ElementUitil {
	
	
	static org.apache.log4j.Logger logger=org.apache.log4j.Logger.getLogger(ElementUitil.class);


	public static void doClick(WebElement ele) {
		try {
			ele.click();
			logger.info("User is able to perform click operation");
		
		} catch (Exception e) {
			e.printStackTrace();
			logger.warn("User is not able to perform click operation");
		}

	}
	public static void enteText(WebElement ele,String value) {
		try {
			ele.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
