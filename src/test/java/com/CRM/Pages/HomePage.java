package com.CRM.Pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//Encapsulation = private data +Public method
	
	private WebDriver driver;
	//initialize driver
	
	public HomePage(WebDriver driver) {//Base class
		this.driver = driver;
		}
	
	//data member (locator)
	private By link = By.linkText("Sign In");
	
	
	//Method(functionality to test)
	
	public String getAppURL() {
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle() {
		return driver.getTitle();
	}
	
	public String getStatusOfLink() {
		driver.findElement(link).click();
		return driver.getCurrentUrl();
		
	}
}
