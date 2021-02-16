package com.project.porm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {

	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.cssSelector(".page-heading");
	By EmailLocator = By.id("email_create");
	
	By CreateBtnLocator = By.name("SubmitCreate");
	By ConfirmationPageLocator = By.cssSelector(".page-subheading");
	By ErrorPageLocator = By.id("create_account_error");
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public void registerCountUser() throws InterruptedException {
		click(registerLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(registerPageLocator)) {
			type("Camilo2@prueba.com",EmailLocator);
			
			click(CreateBtnLocator);
		}else {
			System.out.print("Pagina de registro no encontrada");	
		}
	}
}
