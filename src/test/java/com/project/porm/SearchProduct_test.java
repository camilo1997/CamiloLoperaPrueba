package com.project.porm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchProduct_test {

	private WebDriver driver;
	SearchProductPage searchProductoPage;
	@Before
	public void setUp() throws Exception {
		searchProductoPage = new SearchProductPage(driver);
		driver = searchProductoPage.chromeDriverConnection();
		searchProductoPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		searchProductoPage.registerCountUser();
		Thread.sleep(2000);
	}

}
