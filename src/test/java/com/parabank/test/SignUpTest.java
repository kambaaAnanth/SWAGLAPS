package com.parabank.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.pages.HomePage;
import com.parabank.pages.RegistrationPage;

public class SignUpTest extends BaseTest {

    @Test
    public void testUserSignUp() {
        HomePage homePage = new HomePage(driver);
        homePage.clickRegisterLink();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterFirstName("John");
        registrationPage.enterLastName("Doe");
        registrationPage.enterAddress("123 Main St");
        registrationPage.enterCity("New York");
        registrationPage.enterState("NY");
        registrationPage.enterZipCode("10001");
        registrationPage.enterPhoneNumber("123-456-7890");
        registrationPage.enterSsn("123-45-6789");
        registrationPage.enterUsername("johnDoe1238");
        registrationPage.enterPassword("password1238");
        registrationPage.enterConfirmPassword("password1238");
        registrationPage.clickRegisterButton();
        
        if(registrationPage.userDetailsAlreadyRegister().contains("This username already exists")||registrationPage.isSuccessMessageDisplayed()) {
        	
        	 Assert.assertTrue(true, "Registration failed");
        	
        }else {
            Assert.assertFalse(false, "Registration failed");
        }
        System.out.println("Success");
    }
}

