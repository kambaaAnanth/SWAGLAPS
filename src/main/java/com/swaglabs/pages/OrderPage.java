package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.swaglabs.testbase.BaseTest;

public class OrderPage extends BaseTest {

	WebDriver driver;

	private By firstName = By.id("first-name");

	private By lastName = By.id("last-name");

	private By pincode = By.id("postal-code");

	private By continueBtn = By.id("continue");

	private By finishBtn = By.id("finish");

	private By verifyText = By.xpath("//span[@class='title']");

	public OrderPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String fname) {

		driver.findElement(firstName).sendKeys(fname);
	}

	public void enterLastName(String lname) {

		driver.findElement(lastName).sendKeys(lname);
	}

	public void enterPincode(String postcode) {

		driver.findElement(pincode).sendKeys(postcode+Keys.ENTER);
	}

	public void clickContinueButton() {

		driver.findElement(continueBtn).click();
	}

	public void clickFinishButton() {

		driver.findElement(finishBtn).click();
	}

	public void paymentforProduct(String f_name, String last_Name, String postalCode) throws InterruptedException {

		enterFirstName(f_name);

		enterLastName(last_Name);

		enterPincode(postalCode);

		//clickContinueButton();
		
		Thread.sleep(1000);

		clickFinishButton();
		
		Thread.sleep(1000);

		String actual = driver.findElement(verifyText).getText();

		String expected = prop.getProperty("expectedText");

		Assert.assertEquals(expected, actual, "Your order is not confirmed , Please check");
		
		System.out.println("==========Your product is succefully Placed=============");
	}

}
