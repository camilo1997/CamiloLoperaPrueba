package com.project.porm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends Base {
	
	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.cssSelector(".page-heading");
	By EmailLocator = By.id("email");
	By PasswordLocator = By.id("passwd");
	By CreateBtnLocator = By.name("SubmitLogin");
	By ConfirmationPageLocator = By.cssSelector(".page-subheading");
	By ErrorPageLocator = By.id("create_account_error");

	public SingInPage(WebDriver driver) {
		super(driver);
	}
	
	public void LoginUser() throws InterruptedException {
		click(registerLinkLocator);
		if(isDisplayed(registerPageLocator)) {
			type("prueba123@prueba.com",EmailLocator);
			type("12345678",PasswordLocator);
			click(CreateBtnLocator);
		}else {
			System.out.print("Pagina de registro no encontrada");	
		}
	}
}
