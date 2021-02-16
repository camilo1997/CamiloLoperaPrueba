package com.project.porm;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ContactUs_test {

	private WebDriver driver;
	ContactUsPage contactUsPage;
	@Before
	public void setUp() throws Exception {
		contactUsPage = new ContactUsPage(driver);
		driver = contactUsPage.chromeDriverConnection();
		contactUsPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		
		contactUsPage.registerMessages();
		assertArrayEquals(contactUsPage.SelectDropdownList_SubjectHeading(),"Webmaster");
		Thread.sleep(2000);
		contactUsPage.Enviar();
	}

	private void assertArrayEquals(String selectDropdownList_SubjectHeading, String string) {
		// TODO Auto-generated method stub
		
	}

}
