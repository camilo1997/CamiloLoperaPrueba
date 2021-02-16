package com.project.porm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserPage extends Base {

	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.cssSelector(".page-heading");
	By EmailLocator = By.id("email_create");
	By CreateBtnLocator = By.name("SubmitCreate");
	By RegisterBtnLocator = By.name("submitAccount");
	By ConfirmationPageLocator = By.cssSelector(".page-subheading");

	By CuentaSeñor = By.id("id_gender1");
	By CuentaNombre = By.id("customer_firstname");
	By CuentaApellido = By.id("customer_lastname");
	By CuentaEmail = By.name("email");
	By CuentaPassword = By.name("passwd");
	By CuentaNombre2 = By.name("firstname");
	By CuentaApellido2 = By.name("lastname");
	By CuentaDireccion = By.name("address1");
	By CuentaEstado = By.name("id_state");
	By CuentaCiudad = By.name("city");
	By CuentaCodigoPostal = By.id("postcode");
	By CuentaPais = By.name("id_country");
	By Cuentatelefono = By.name("phone");
	By CuentaCel = By.name("phone_mobile");
	By CuentaApodo = By.name("alias");
	
	By dropdownlist_State = By.id("id_state");
	By dropdownlist_Country = By.id("id_country");
	
	public RegisterUserPage(WebDriver driver) {
		super(driver);
	}

	public void registerUser() throws InterruptedException {
		
		click(registerLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(registerPageLocator)) {
			type("camilo1@prueba.com",EmailLocator);
			
			click(CreateBtnLocator);
		}else {
			System.out.print("Pagina de registro no encontrada");	
		}
		Thread.sleep(2000);
		
			
			type("camilo",CuentaNombre);
			type("lopera",CuentaApellido);
			type("calle 1 - 11",CuentaDireccion);
			type("medellin",CuentaCiudad);
			type("51125658",CuentaCel);
			type("juli",CuentaApodo);
			type("01010",CuentaCodigoPostal);
			type("12345678",CuentaPassword);
		
	}
	
	public String SelectDropdownList_State() throws InterruptedException {
		Select selectList = new Select(findElement(dropdownlist_State));
		selectList.selectByVisibleText("California");
		
		return getText(selectList.getFirstSelectedOption());
		
	}
	
	public String SelectDropdownList_Country() throws InterruptedException {
		Select selectList = new Select(findElement(dropdownlist_Country));
		selectList.selectByVisibleText("United States");
		
		return getText(selectList.getFirstSelectedOption());
		
	}
	
	public void Enviar() {
		click(RegisterBtnLocator);
	}
	
	
}
