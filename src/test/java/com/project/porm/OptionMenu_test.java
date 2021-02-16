package com.project.porm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OptionMenu_test {
	
	private WebDriver driver;
	OptionMenuPage optionMenuPage;

	@Before
	public void setUp() throws Exception {
		optionMenuPage = new OptionMenuPage(driver);
		driver = optionMenuPage.chromeDriverConnection();
		optionMenuPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		optionMenuPage.viewOptionMenu();
		Thread.sleep(2000);
	}

}
