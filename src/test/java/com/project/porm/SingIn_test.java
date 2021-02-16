package com.project.porm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SingIn_test {
	private WebDriver driver;
	SingInPage singInPage;

	@Before
	public void setUp() throws Exception {
		singInPage = new SingInPage(driver);
		driver = singInPage.chromeDriverConnection();
		singInPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		singInPage.LoginUser();
		Thread.sleep(2000);
		
	}

}
