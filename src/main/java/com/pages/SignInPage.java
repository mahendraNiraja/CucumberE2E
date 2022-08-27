package com.pages;

import org.openqa.selenium.By;

public class SignInPage {
   public String val;
   public By jobseekerLoginButton = By.xpath("//li[label[a[@data-check='menutab']]]/following::a/span[contains(text(),'Jobseeker Login')]");
   public By emailInputBox = By.xpath("//input[@id='signInName']");
   public By passwordInputBox = By.xpath("//input[@id='password']");
   //By blueLoginButton = By.xpath("//input[@value='Login']");
   public By blueLoginButton = By.xpath("//input[@value='Login']");
   public By monsterLogo= By.xpath("//div[@class='monster-logo primary-logo']/a/img");

}
