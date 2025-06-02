package com.swaglabs.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.pages.CartPage;
import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.ProductPage;
import com.swaglabs.testbase.BaseTest;

public class CartPageTest extends BaseTest {

	LoginPage login;

	ProductPage product;

	CartPage cart;

	@BeforeMethod

	public void setUp() {
		initialization();

		login = new LoginPage(driver);

		product = new ProductPage(driver);

		cart = new CartPage(driver);

	}

	@Test

	public void checkOutItem() throws InterruptedException {

		login.loginsuceess(prop.getProperty("username"), prop.getProperty("password"));
		
		Thread.sleep(1000);

		product.addProductToCart();
		
		Thread.sleep(1000);

		cart.checkOutTheProduct();
	}

	@AfterMethod

	public void tearDown() {

		driver.quit();
	}
}
