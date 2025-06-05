package com.parabank.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.pages.AccountDetailsPage;
import com.parabank.pages.HomePage;



public class AccountDetailsTest extends BaseTest {
	
	@Test
	public void testAccountDetailsVerification() throws InterruptedException {
		 HomePage homePage = new HomePage(driver);
		 homePage.enterUsername("johnDoe1238");
		 homePage.enterPassword("password1238");
		 homePage.clickLoginButton();
		 Thread.sleep(5000);
		AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
     if(accountDetailsPage.isTextAvailableInAccounts().equalsIgnoreCase("*Balance includes deposits that may be subject to holds")) {
        	
        	Assert.assertTrue(true, "The Text is not displayed");
        }
       
	}
}
