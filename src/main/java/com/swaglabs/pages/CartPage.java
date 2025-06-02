package com.swaglabs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.swaglabs.testbase.BaseTest;

public class CartPage extends BaseTest {

	WebDriver driver;

	List<String> products = new ArrayList<String>();

	private By cartIcon = By.xpath("//a[@class='shopping_cart_link']");

	private By productList = By.xpath("inventory_item_label");

	private By removeFromCart = By.id("remove-sauce-labs-backpack");

	private By checkOutBtn = By.id("checkout");

	public CartPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void clickOnCartIcon() {

		driver.findElement(cartIcon).click();
	}


	public void clickRemoveBtn() {

		driver.findElement(removeFromCart).click();
	}

	public void clickCheckBtn() {

		driver.findElement(checkOutBtn).click();
		;

	}

	public void checkOutTheProduct() {

		clickOnCartIcon();

		List<WebElement> totalList = driver.findElements(productList);

		for (WebElement webElement : totalList) {

			String productName = webElement.getText();

			if (productName.equals(prop.getProperty("product"))) {

				Assert.assertTrue(true);

			} else {

				Assert.assertFalse(false, "Prodcut is not same");
			}

		}
		clickCheckBtn();
	}
}
