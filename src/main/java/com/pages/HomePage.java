package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


	private WebDriver driver;
	public HomePage(WebDriver driver){

		this.driver=driver;

	}

	private By loginButton =By.xpath("//header/header/div/div[3]/div/div/nav/div[2]/ul[2]/ul/li[1]/a/span[2]");
	private By userNameTextBox =By.xpath("//*[@id='signInName']");
	private By passworsTextBox =By.xpath("//*[@id='password']");
	private By signBtn=By.id("signInbtn");
	private By noThanks=By.xpath("//*[text()='No Thanks']");

	public void clickOnJobSeekerLoginBtn() {

		try {
//			String firstWindow= driver.getWindowHandle();
//			System.out.println("firstWindow-->"+firstWindow);
//			ElementUitil.switchWindow(driver, firstWindow);
//			WebElement f= driver.findElement(By.xpath("//*[@id='ssIFrame_google']"));
//			driver.switchTo().frame(f);
		//	driver.findElement(noThanks).click();
			driver.findElement(loginButton).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void enterUserName(String Username) {

		try {

			driver.findElement(userNameTextBox).sendKeys(Username);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void enterPassword(String password) {

		try {

			driver.findElement(passworsTextBox).sendKeys(password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void clickOnSingInBtn() {

		try {

			driver.findElement(signBtn).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
