package com.qa.YourLogo_Assessment;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;
import com.qa.yourlogo.BrowserHelper;
import com.qa.yourlogo.Page;

/**
* This Class provides generic Browser methods to be used by Test files
* like setup, tear down, Take screenshots after each test
*/
public class BaseTest {
	BrowserHelper browser_helper = new BrowserHelper();
//	public WebDriver driver = BrowserHelper.get_web_driver();
	public WebDriver driver = browser_helper.get_web_driver();
	public Page page;
	public String baseUrl= "http://automationpractice.com/";
	
	@AfterMethod
    public void TakeScreenshot(ITestResult result) {
			try {
	            // Creating instance of File
	            File File = ((TakesScreenshot)driver)
	                            .getScreenshotAs(OutputType.FILE);
	     
	            FileUtils.copyFile(File,
	                               new File("./Screenshots/" + result.getMethod().getMethodName() +".jpeg"));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
        }
	
	@BeforeTest
	public void setup() {
		browser_helper.OpenBrowser();
		browser_helper.OpenURL(baseUrl);
		
		//Create the Object for Page class (Instantiate the Page Class) 
		page = new Page(driver);
	}
	
	@AfterTest
	public void tear_down() {
		browser_helper.CloseBrowser();
		
	}
}