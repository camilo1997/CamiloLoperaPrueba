package com.project.porm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends Base {
	
	By ContactLinkLocator = By.linkText("Contact us");
	By ContactPageLocator = By.cssSelector(".page-heading");
	By contactBody = By.id("contact");
	By EmailLocator = By.id("email");
	By OrderLocator = By.id("id_order");
	By MessageLocator = By.id("message");
	By dropdownlist_Heading = By.id("id_contact");
	
	By EnviarBtnLocator = By.name("submitMessage");
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public void registerMessages() throws InterruptedException {
		
		click(ContactLinkLocator);
		if(isDisplayed(ContactPageLocator)) {
			type("prueba123@prueba.com",EmailLocator);
			type("12345678",OrderLocator);
			type("mensaje de prueba",MessageLocator);
			Thread.sleep(2000);
			
		}else {
			System.out.print("Pagina de registro no encontrada");	
		}
	
	}
	
	public String SelectDropdownList_SubjectHeading() throws InterruptedException {
		Select selectList = new Select(findElement(dropdownlist_Heading));
		selectList.selectByVisibleText("Webmaster");
		
		return getText(selectList.getFirstSelectedOption());
		
	}
	
	public void Enviar() {
		click(EnviarBtnLocator);
	}
	
	
	
	
	
	
}



