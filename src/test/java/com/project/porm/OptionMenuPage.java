package com.project.porm;

import org.openqa.selenium.WebDriver;

public class OptionMenuPage extends Base {

	
	public OptionMenuPage(WebDriver driver) {
		super(driver);
	}
	
	public void viewOptionMenu() throws InterruptedException  {
		Thread.sleep(2000);
		visit("http://automationpractice.com/index.php?id_category=3&controller=category");
	}
	
}
