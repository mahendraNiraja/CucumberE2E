package com.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ElementUitil {



	//To Handle Multiple Windows or Switch Between Multiple Windows.
	public static void switchWindow(WebDriver driver, String firstWindow)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("sendWindow>>"+windowHandles);
		for(String windows : windowHandles)
		{
			if(!windows.equals(firstWindow))
			{
				driver.switchTo().window(windows);
			}
		}
	}

}
