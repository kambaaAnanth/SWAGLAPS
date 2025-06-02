package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.testbase.BaseTest;

public class LoginPage extends BaseTest {

	WebDriver driver;

	private By username = By.id("user-name");

	private By password = By.id("password");

	private By loginBtn = By.id("login-button");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String uname) {

		driver.findElement(username).sendKeys(uname);

	}

	public void enterPassword(String pword) {

		driver.findElement(password).sendKeys(pword);
	}

	public void clickLoginBtn() {

		driver.findElement(loginBtn).click();
	}

	public void loginsuceess(String email, String password) {
		enterUsername(email);
		enterPassword(password);
		clickLoginBtn();
	}

}
