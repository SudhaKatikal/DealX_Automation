package com.qa.yourlogo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	//Generic Utility Wrapper Methods
	
	public void perform_click(By locator) {
		try {
			driver.findElement(locator).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String perform_get_text(By locator) {
		String text = null;;
		try {
			text = driver.findElement(locator).getText();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public void perform_hover(By locator) {
		try {
   
	        Actions actions = new Actions(driver);
	    	WebElement menuOption = driver.findElement(locator);
	    	actions.moveToElement(menuOption).perform();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean validate_if_element_exist(By locator) {
		boolean is_web_element_displayed = false;
		try {
			is_web_element_displayed = driver.findElement(locator).isDisplayed();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return is_web_element_displayed;
	}
}
