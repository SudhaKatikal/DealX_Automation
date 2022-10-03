package com.qa.YourLogo_Assessment;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.qa.yourlogo.YourLogoPage;

public class TC6_MenuNavigation extends BaseTest{
	
	/**
	* This is Test method for testing Hover of WomanMenu
	* and Verify the SubMenu is displayed
	*/
	@Test(priority=1)
	public void verifyHoveringWomanMenu() {
		boolean result = page.getInstance(YourLogoPage.class).hover_on_women_menu();
		Reporter.log("Hovering Results on WOMEN Menu: " + result);
		assertTrue(result, "Submenu is not displayed under WOMEN Menu");
	}
	
	/**
	* This is Test method for testing Hover of DressesMenu
	* and Verify the SubMenu is displayed
	*/
	@Test(priority=2)
	public void verifyHoveringDressesMenu() {
		boolean result = page.getInstance(YourLogoPage.class).hover_on_dresses_menu();
		Reporter.log("Hovering Results on DRESSES Menu: " + result);
		assertTrue(result, "Submenu is not displayed under Dresses Menu");
	}
	
	/**
	* This is Test method for testing Click on TshirtsMenu
	* and Verify the right Page is displayed
	*/
	@Test(priority=3)
	public void verifyClickOnTshirtsMenu() {
		String text = page.getInstance(YourLogoPage.class).click_on_tshirts_menu();
		Reporter.log("After Click on T-SHIRTS Menu, String on the Page: " + text);
		assertEquals(text.strip(), "T-SHIRTS", "T-SHIRTS Page is not loaded");
	}
	
	/**
	* This is Test method for testing Tshirts SubMenu Under Women Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=4)
	public void verifyClickOnTshirtsSubMenu_Under_Women_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_tshirts_sub_menu_under_women_menu();
		Reporter.log("After Click on T-SHIRTS Sub Menu under the WOMEN Menu, String on the Page: " + text);
		assertEquals(text.strip(), "T-SHIRTS", "T-SHIRTS Page is not loaded");
	}
	
	/**
	* This is Test method for testing Blouses SubMenu Under Women Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=5)
	public void verifyClickOnBlousesSubMenu_Under_Women_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_blouses_sub_menu_under_women_menu();
		Reporter.log("After Click on BLOUSES Sub Menu under the WOMEN Menu, String on the Page: " + text);
		assertEquals(text.strip(), "BLOUSES", "BLOUSES Page is not loaded");
	}

	/**
	* This is Test method for testing CasualDresses submenu Under Women Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=6)
	public void verifyClickOn_CasualDresses_submenu_Under_Women_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_casual_dresses_submenu_under_women_menu();
		Reporter.log("After Click on CASUAL DRESSES Sub Menu under the WOMEN Menu, String on the Page: " + text);
		assertEquals(text.strip(), "CASUAL DRESSES".strip(), "CASUAL DRESSES Page is not loaded");
	}
	
	/**
	* This is Test method for testing EveningDresses submenu Under Women Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=7)
	public void verifyClickOn_EveningDresses_submenu_Under_Women_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_evening_dresses_submenu_under_women_menu();
		Reporter.log("After Click on EVENING DRESSES Sub Menu under the WOMEN Menu, String on the Page: " + text);
		assertEquals(text.strip(), "EVENING DRESSES".strip(), "EVENING DRESSES Page is not loaded");
	}
	
	/**
	* This is Test method for testing SummerDresses submenu Under Women Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=8)
	public void verifyClickOn_SummerDresses_submenu_Under_Women_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_summer_dresses_submenu_under_women_menu();
		Reporter.log("After Click on SUMMER DRESSES Sub Menu under the WOMEN Menu, String on the Page: " + text);
		assertEquals(text.strip(), "SUMMER DRESSES".strip(), "SUMMER DRESSES Page is not loaded");
	}
	
	/**
	* This is Test method for testing CasualDresses submenu Under Dresses Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=9)
	public void verifyClickOn_CasualDresses_submenu_Under_Dresses_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_casual_dresses_sub_menu_under_dresses();
		Reporter.log("After Click on CASUAL DRESSES Sub Menu under the DRESSES Menu, String on the Page: " + text);
		assertEquals(text.strip(), "CASUAL DRESSES".strip(), "CASUAL DRESSES Page is not loaded");
	}
	
	/**
	* This is Test method for testing EveningDresses submenu Under Dresses Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=10)
	public void verifyClickOn_EveningDresses_submenu_Under_Dresses_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_evening_dresses_sub_menu_under_dresses();
		Reporter.log("After Click on EVENING DRESSES Sub Menu under the DRESSES Menu, String on the Page: " + text);
		assertEquals(text.strip(), "EVENING DRESSES".strip(), "EVENING DRESSES Page is not loaded");
	}
	
	/**
	* This is Test method for testing SummerDresses submenu Under Dresses Menu
	* and Verify the right Page is displayed
	*/
	@Test(priority=11)
	public void verifyClickOn_SummerDresses_submenu_Under_Dresses_Menu() {
		String text = page.getInstance(YourLogoPage.class).click_on_summer_dresses_sub_menu_under_dresses();
		Reporter.log("After Click on SUMMER DRESSES Sub Menu under the DRESSES Menu, String on the Page: " + text);
		assertEquals(text.strip(), "SUMMER DRESSES".strip(), "SUMMER DRESSES Page is not loaded");
	}
	
}

