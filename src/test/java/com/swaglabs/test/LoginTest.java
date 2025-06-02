package com.swaglabs.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.pages.LoginPage;
import com.swaglabs.testbase.BaseTest;

public class LoginTest extends BaseTest {

	LoginPage login;

	@BeforeMethod

	public void setUp() {
		initialization();

		login = new LoginPage(driver);

	}

	@Test
	public void loginSuccess() {

		login.loginsuceess(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod

	public void tearDown() {

		driver.quit();
	}

}
