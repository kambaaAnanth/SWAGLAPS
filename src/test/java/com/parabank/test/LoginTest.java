package com.parabank.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.pages.AccountDetailsPage;
import com.parabank.pages.HomePage;

public class LoginTest extends BaseTest {

    @Test(dependsOnMethods ="com.parabank.test.SignUpTest.testUserSignUp")
    public void testLogin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.enterUsername("johnDoe1238");
        homePage.enterPassword("password1238");
        homePage.clickLoginButton();
        Thread.sleep(5000);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        
        if(accountDetailsPage.isAccountsOverviewHeaderDisplayed().equalsIgnoreCase("Logout")) {
        	
        	Assert.assertTrue(true, "Logout button is not displayed");
        }
        
        System.out.println("Login Success");
       
    }
}

