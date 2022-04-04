package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	private By allHeader = By.xpath("//div/div/div[2]/div/div[1]/div/div[1]/ul/li/a");

	public List<String> getAllheaders() {

		try {
			List<WebElement> allheade = driver.findElements(allHeader);
			List<String> headers = new ArrayList<>();
			for (WebElement e : allheade) {
				System.out.println("N" + e.getText());
				String test = e.getText();
				headers.add(test);
			}
			return headers;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public int getHeaderCount() {

		try {
			List<WebElement> allheade = driver.findElements(allHeader);
			int count=allheade.size();
          return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
