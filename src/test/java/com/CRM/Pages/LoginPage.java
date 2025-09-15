package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
		
	//Constructor
	public LoginPage(WebDriver driver){//Base class
		this.driver = driver;
	}
	
	//Access loginpage locators
		private By email = By.id("email-id");
		private By password = By.id("password");
		private By submit = By.id("submit-id");
		
		private By signOut = By.linkText("Sign Out");

	//Methods
				
		public String loginToSite(String em, String ps) {
			driver.findElement(email).sendKeys(em);;
			driver.findElement(password).sendKeys(ps);
			driver.findElement(submit).click();
			return driver.getCurrentUrl();
		}
		public String signOutToSite() {
			driver.findElement(signOut).click();;
			return driver.getCurrentUrl();
		}
}
