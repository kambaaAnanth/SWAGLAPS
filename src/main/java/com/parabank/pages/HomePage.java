package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(linkText = "Register")
	WebElement registerLink;

	@FindBy(name = "username")
	WebElement usernameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginButton;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickRegisterLink() {
		registerLink.click();
	}

	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
}
