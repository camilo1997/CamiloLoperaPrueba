package com.project.porm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterUser_test {

	private WebDriver driver;
	RegisterUserPage registerUserPage;
	@Before
	public void setUp() throws Exception {
		registerUserPage = new RegisterUserPage(driver);
		driver = registerUserPage.chromeDriverConnection();
		registerUserPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		
		
		registerUserPage.registerUser();
		assertArrayEquals(registerUserPage.SelectDropdownList_State(),"California");
		assertArrayEquals(registerUserPage.SelectDropdownList_Country(),"United States");
		Thread.sleep(2000);
		registerUserPage.Enviar();
	}

	private void assertArrayEquals(String selectDropdownList_State, String string) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
