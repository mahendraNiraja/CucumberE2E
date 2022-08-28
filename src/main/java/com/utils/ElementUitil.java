package com.utils;

import org.openqa.selenium.WebElement;

public class ElementUitil {

	public static void doClick(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			e.printStackTrace();
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
