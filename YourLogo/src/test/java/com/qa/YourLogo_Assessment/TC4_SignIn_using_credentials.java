package com.qa.YourLogo_Assessment;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TC4_SignIn_using_credentials extends BaseTest {
	public String baseUrl= "http://automationpractice.com/";
	private static final String username= "sudha.katikala10@gmail.com";
	private static final String password = "Sudha@mystore4120";
	
	/**
	* This Test method Sign in into the YourLogo Website entering the user credentials 
	* in the username, password input boxes and hit enter on the Submit button
	* and Verify the Cart is displayed after sign in to confirm user is logged in succesfully. 
	*/
	@Test(priority=4)
	public void TestCase4_SignIn_using_credentials()
	{
		try {
			//Click on Signin button
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("passwd")).sendKeys(password);
			
			driver.findElement(By.id("SubmitLogin")).click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			//Finding the Web element for Cart, to make sure that User is logged in successfully
			String cart_text= driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).getText();
			boolean is_cart_displayed = cart_text.contains("Cart");
			if (is_cart_displayed) {
				Reporter.log("User Logged in successfully");
			}	
			assertTrue(is_cart_displayed, "User is not able to logged in Succesfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
