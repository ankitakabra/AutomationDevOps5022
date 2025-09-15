package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase extends BaseClass {
	
  @Test(priority =1)
  public void validateCurrentURL() {
	  
	  String actURL = hp.getAppURL();
	  Assert.assertTrue(actURL.contains("crm"), "Test Case Failed : Current URL isn't matched!");
	  System.out.println("Test Case Passed : Current URL is matched!");
  }
  
  @Test(priority =2)
  public void validateTitle() {
	  String title = hp.getAppTitle();
	  Assert.assertTrue(title.contains("Customer"), "Test Case Failed : Title isn't matched!");
	  System.out.println("Test Case Passed : Title Matched");
  }
  
  @Test(priority =3)
  public void validateSignInPage() {
	  hp.getStatusOfLink();
	  String signInUrl = hp.getAppURL();
	  Assert.assertTrue(signInUrl.contains("login"),"Test Case Failed : Login page not opened!");
	  System.out.println("Test Case Passed : Login page opened!");
  }
}
