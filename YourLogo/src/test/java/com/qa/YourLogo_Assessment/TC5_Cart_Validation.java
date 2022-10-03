package com.qa.YourLogo_Assessment;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC5_Cart_Validation extends TC4_SignIn_using_credentials{
	String dress_model = "Printed Dress";
	
	/**
	* This method calculate the Total price based on price of the unit and number of units
	* and returns String of calculated total price 
	* @param unit_price, this is price of the unit
	* @param quantity, this is number of units
	* @return      the String of calculated total price 
	*/
	private String calcualte_total_price(String unit_price, String quantity) 
	{
		float converted_Unit_Price = 0;
		int converted_quantity = 0;
		float total_amount = 0;
		try {
			converted_Unit_Price = Float.parseFloat(unit_price);
			converted_quantity = Integer.parseInt(quantity);
		} catch (Exception e){
			Reporter.log("Couldn't convert unit price or Quantity");
		}
		total_amount = converted_Unit_Price * converted_quantity;
		
		return Float.toString(total_amount);
	}
	
	/**
	* This Test method reuse the TestCase1 method
	* This method pass the Search strings in Xlsx Spraedsheet one by one to to TC1_SerachAndVerify API 
	* and Verify the First Result matches the search criteria. 
	*/
	@Test(priority=5)
	public void TestCase5_Cart_Validation()
	{
		try {
			
			//Entering the dress model in search and click on Search button 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("search_query_top")).click();
			driver.findElement(By.id("search_query_top")).clear();
			driver.findElement(By.id("search_query_top")).sendKeys(dress_model);
			
			driver.findElement(By.name("submit_search")).click();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selecting the Dress and click on it 
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//After opening Detailed information of that dress, click on the cart
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Button Click on Proceed Shopping 
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Button Click on View cart
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Incrementing the cart count to add another dress to the cart
			driver.findElement(By.xpath("//*[@title=\"Add\"]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			String Unit_Price = driver.findElement(By.xpath("//td[@class=\"cart_unit\"]/span/span[@class=\"price\"]")).getText();
			//Removing the $ character if it it there in the Unit price
			Unit_Price = Unit_Price.contains("$") ? (Unit_Price).replace("$", "") : Unit_Price;
			Reporter.log("Unit Price: " + Unit_Price);
			
			String Quantity = driver.findElement(By.xpath("//*[@class=\"cart_quantity_input form-control grey\"]")).getAttribute("value");
			Reporter.log("Quantity: " + Quantity);
			

			String total_price_calculated = calcualte_total_price(Unit_Price, Quantity);
			String total_price_captured = driver.findElement(By.xpath("//td[@class=\"cart_total\"]")).getText();
			Reporter.log("Total price captured: " + total_price_captured);
			
			
			//Removing the $ character if it it there in the Total price
			total_price_captured = total_price_captured.contains("$") ? (total_price_captured).replace("$", "") : total_price_captured;
			
			if (total_price_captured.contentEquals(total_price_calculated))
			{
				Reporter.log("Total Price captured on Cart is matcthed with Expected Amount");
			}
			
			assertEquals(total_price_captured, total_price_calculated, "Total Price captured on Cart is not matcthed with Expected Amount");		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
