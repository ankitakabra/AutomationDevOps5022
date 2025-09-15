package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass {
	
	@BeforeClass
	public void accessSignIn() {
		hp.getStatusOfLink();
	}
  @Test(priority =1)
  public void validatelogin() {
	  String actUrl = lp.loginToSite("test@gmail.com", "test@123");
	  Assert.assertTrue(actUrl.contains("customers"), "Test Failed : Not logged in" );
	  System.out.println("Test Passed : User logged in");
  }
  
  @Test(priority =2)
  public void logout() {
	  String currentUrl = lp.signOutToSite();
	  Assert.assertTrue(currentUrl.contains("sign-out"), "TestCase Failed : User not logged out");
	  System.out.println("TestCase Passed : User successfully logged out");
  }
  
}
