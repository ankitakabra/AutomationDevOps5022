package com.CRM.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	
  @BeforeTest
  public void launchBrowser() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://automationplayground.com/crm/");
	  
	  hp = new HomePage(driver);
	  lp = new LoginPage(driver);
  }

  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }

}
