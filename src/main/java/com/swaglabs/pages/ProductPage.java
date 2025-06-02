package com.swaglabs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.testbase.BaseTest;

public class ProductPage extends BaseTest {

	WebDriver driver;

	List<String> products = new ArrayList<String>();

	private By productList = By.xpath("inventory_item_label");

	private By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");

	private By productAmount = By.className("inventory_item_price");

	public ProductPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void selectProductName() {

		List<WebElement> totalList = driver.findElements(productList);

		for (WebElement webElement : totalList) {

			products.add(webElement.getText());

		}
	}

	public void clickAddToCartBtn() {

		driver.findElement(addToCartBtn).click();
	}

	public String getProductAmount() {

		String Amount = driver.findElement(productAmount).getText();

		return Amount;
	}

	public void addProductToCart() {

		for (String string : products) {

			if (string.equals(prop.getProperty("product"))) {

				driver.findElement(productList).click();
			} else {

				System.out.println("Your product is not in list , Please verify");
			}

		}

		clickAddToCartBtn();

	}

}// class Ended
