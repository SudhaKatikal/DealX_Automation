package com.qa.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public <PageGeneric extends BasePage> PageGeneric getInstance(Class<PageGeneric> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
