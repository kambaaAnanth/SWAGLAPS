package com.swaglabs.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.ProductPage;
import com.swaglabs.testbase.BaseTest;

public class ProductPageTest extends BaseTest {

	LoginPage login;

	ProductPage product;

	@BeforeMethod

	public void setUp() {
		initialization();

		login = new LoginPage(driver);

		product = new ProductPage(driver);

	}

	@Test

	public void addProductToCart() throws InterruptedException {

		login.loginsuceess(prop.getProperty("username"), prop.getProperty("password"));
		
		Thread.sleep(1000);

		product.addProductToCart();
	}

	@AfterMethod

	public void tearDown() {

		driver.quit();
	}

}
