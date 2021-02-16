package com.project.porm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterPage_test {
	private WebDriver driver;
	RegisterPage registerPage;

	@Before
	public void setUp() throws Exception {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConnection();
		registerPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void Emailtest() throws InterruptedException {
		registerPage.registerCountUser();
		
	}

}
