package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.driverFactory.DriverFactory;
import com.utils.ElementUitil;

public class SignInPage {

	private By jobseekerLoginButton = By
			.xpath("//li[label[a[@data-check='menutab']]]/following::a/span[contains(text(),'Jobseeker Login')]");
	private By emailInputBox = By.xpath("//input[@id='signInName']");
	private By passwordInputBox = By.xpath("//input[@id='password']");
	private By blueLoginButton = By.xpath("//input[@value='Login']");
	private By monsterLogo = By.xpath("//div[@class='monster-logo primary-logo']/a/img");

	public void clickOnJobseekerLoginButton() {

		try {

			WebElement ele = DriverFactory.getDriver().findElement(jobseekerLoginButton);
			ElementUitil.doClick(ele);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}