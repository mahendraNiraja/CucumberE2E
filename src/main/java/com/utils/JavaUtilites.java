package com.utils;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.driverFactory.DriverFactory;

public class JavaUtilites {
	
	 public static String getRandomString(int len)
	 {
		 
		// create a string of all characters
		    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    // create random string builder
		    StringBuilder sb = new StringBuilder();

		    // create an object of Random class
		    Random random = new Random();

		    // specify length of random string
		 

		    for(int i = 0; i < len; i++) {

		      // generate random index number
		      int index = random.nextInt(alphabet.length());

		      // get character specified by index
		      // from the string
		      char randomChar = alphabet.charAt(index);

		      // append the character to string builder
		      sb.append(randomChar);
		    }

		    String randomString = sb.toString();
		    System.out.println("Random String is: " + randomString);
			return randomString;

	 }
	/* public static void main(String[] args) {
		System.out.println(getRandomString(8));
		 
		
	}*/
	 
	 public static void waitForElements(By element,String type)
	 {
		
		  if(type.equalsIgnoreCase("clickable"))
{
		 WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(DriverFactory.getDriver().findElement(element)));
}	
		  if(type.equalsIgnoreCase("presence"))  
		  {
			  WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
			  wait.until(ExpectedConditions.presenceOfElementLocated(element));
		  }
	 }
	
	public static String GenerateRandomNumber(int charLength) {
        return String.valueOf(charLength < 1 ? 0 : new Random()
                .nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
                + (int) Math.pow(10, charLength - 1));
    }
	 
	 
}
