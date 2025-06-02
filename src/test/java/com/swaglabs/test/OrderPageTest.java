package com.swaglabs.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.pages.CartPage;
import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.OrderPage;
import com.swaglabs.pages.ProductPage;
import com.swaglabs.testbase.BaseTest;

public class OrderPageTest extends BaseTest {
	
	LoginPage login;

	ProductPage product;

	CartPage cart;
	
	OrderPage order;

	@BeforeMethod

	public void setUp() {
		initialization();

		login = new LoginPage(driver);

		product = new ProductPage(driver);

		cart = new CartPage(driver);
		
		order=new OrderPage(driver);

	}

	@Test

	public void orderTheProduct() throws InterruptedException {

		login.loginsuceess(prop.getProperty("username"), prop.getProperty("password"));
		
		Thread.sleep(1000);

		product.addProductToCart();
		
		Thread.sleep(1000);

		cart.checkOutTheProduct();
		
		Thread.sleep(1000);
		
		order.paymentforProduct(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("postalCode"));
	}

	@AfterMethod

	public void tearDown() {

		driver.quit();
	}

}
