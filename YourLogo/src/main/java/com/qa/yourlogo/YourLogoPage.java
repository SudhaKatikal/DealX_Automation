package com.qa.yourlogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourLogoPage extends BasePage {

	public YourLogoPage(WebDriver driver) {
		super(driver);
	}

	
	By hover_women_menu = By.xpath("//a[@title=\"Women\" and @class=\"sf-with-ul\"]");
	By tshirt_submenu_under_women_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");
	By blouses_submenu_under_women_menu = By.xpath("//a[@title=\"Blouses\"]");
	By casual_dresses_submenu_under_women_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a");
	By evening_dresses_submenu_under_women_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]/a");
	By summer_dresses_submenu_under_women_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a");

	
	
	By hover_dresses_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	By casual_dresses_submenu_under_dresses_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
	By evening_dresses_submenu_under_dresses_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a");
	By summer_dresses_submenu_under_dresses_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");
	
	
	By hover_tshirts_menu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	By page_content = By.xpath("//*[@id=\"center_column\"]/h1/span[1]");
	


	public boolean hover_on_women_menu() {
		perform_hover(hover_women_menu);
		return validate_if_element_exist(tshirt_submenu_under_women_menu);
	}
	
	public boolean hover_on_dresses_menu() {
		perform_hover(hover_dresses_menu);
		return validate_if_element_exist(casual_dresses_submenu_under_dresses_menu);
	}
	
	public String click_on_tshirts_menu() {
		String text = null;
		perform_click(hover_tshirts_menu);
		if(validate_if_element_exist(page_content)) {
			text = perform_get_text(page_content);
		}
		return text;
	}
	
	public String click_on_tshirts_sub_menu_under_women_menu() {
		String text = null;
		perform_hover(hover_women_menu);
		if(validate_if_element_exist(tshirt_submenu_under_women_menu))
		{
			perform_click(tshirt_submenu_under_women_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}
	
	public String click_on_blouses_sub_menu_under_women_menu() {
		String text = null;
		perform_hover(hover_women_menu);
		if(validate_if_element_exist(blouses_submenu_under_women_menu))
		{
			perform_click(blouses_submenu_under_women_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}

	public String click_on_casual_dresses_submenu_under_women_menu() {
		String text = null;
		perform_hover(hover_women_menu);
		if(validate_if_element_exist(casual_dresses_submenu_under_women_menu))
		{
			perform_click(casual_dresses_submenu_under_women_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}
	
	public String click_on_evening_dresses_submenu_under_women_menu() {
		String text = null;
		perform_hover(hover_women_menu);
		if(validate_if_element_exist(evening_dresses_submenu_under_women_menu))
		{
			perform_click(evening_dresses_submenu_under_women_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}
	
	public String click_on_summer_dresses_submenu_under_women_menu() {
		String text = null;
		perform_hover(hover_women_menu);
		if(validate_if_element_exist(summer_dresses_submenu_under_women_menu))
		{
			perform_click(summer_dresses_submenu_under_women_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}
	
	public String click_on_casual_dresses_sub_menu_under_dresses() {
		String text = null;
		perform_hover(hover_dresses_menu);
		if(validate_if_element_exist(casual_dresses_submenu_under_dresses_menu))
		{
			perform_click(casual_dresses_submenu_under_dresses_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}
	
	public String click_on_evening_dresses_sub_menu_under_dresses() {
		String text = null;
		perform_hover(hover_dresses_menu);
		if(validate_if_element_exist(evening_dresses_submenu_under_dresses_menu))
		{
			perform_click(evening_dresses_submenu_under_dresses_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}
	
	public String click_on_summer_dresses_sub_menu_under_dresses() {
		String text = null;
		perform_hover(hover_dresses_menu);
		if(validate_if_element_exist(summer_dresses_submenu_under_dresses_menu))
		{
			perform_click(summer_dresses_submenu_under_dresses_menu);
			if(validate_if_element_exist(page_content)) {
				text = perform_get_text(page_content);
			}
		}
		return text;
	}
}
