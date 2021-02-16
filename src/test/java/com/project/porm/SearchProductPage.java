package com.project.porm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage extends Base {

	By searchPageLocator = By.cssSelector(".page-heading  product-listing");
	By SearchProduct = By.id("search_query_top");
	By BtnSelect = By.id("search_query_top");
	By btnSearch = By.name("submit_search");
	
	public SearchProductPage(WebDriver driver) {
		super(driver);
	}
	
	public void registerCountUser() throws InterruptedException {
		
			Thread.sleep(2000);
			click(BtnSelect);
			type("T-shirts",SearchProduct);
			Thread.sleep(2000);
			click(btnSearch);
		
	}

}
