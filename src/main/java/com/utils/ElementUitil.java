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

}
