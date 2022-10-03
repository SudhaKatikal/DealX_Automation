

package com.qa.YourLogo_Assessment;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TC1_SearchAndVerify extends BaseTest {
	
	private String search_string = "Dress";
	
	public void set_search_string(String _search_string)
	{
		this.search_string = _search_string;
	}
	
	@Test(priority=1)
	public void TestCase1_PerformSearchAndValidate() {

		PerformSearchAndValidate();
	}
	
	/**
	* This method enter the search string in search input box and click on Search icon 
	* and Verify the First Result matches the search criteria. 
	*/
	public void PerformSearchAndValidate() {

		driver.findElement(By.id("search_query_top")).click();
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(this.search_string);
		
		driver.findElement(By.name("submit_search")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String first_search_result_string = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText();
		
		
		Reporter.log("Input Search string:" +  this.search_string + ", First Search Result occurence:" + first_search_result_string);
		
		boolean is_result_contains_search_string = first_search_result_string.contains(this.search_string);
		if (is_result_contains_search_string)
		{
			Reporter.log("Input Search string is found in First Search Result occurence");
		}	
		assertTrue(is_result_contains_search_string, "Input Search string is not found in First Search Result occurence");
		
	}
}
