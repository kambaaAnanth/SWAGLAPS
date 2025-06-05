package com.parabank.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {

    @FindBy(id = "customer.firstName")
    WebElement firstNameField;

    @FindBy(id = "customer.lastName")
    WebElement lastNameField;

    @FindBy(id = "customer.address.street")
    WebElement addressField;

    @FindBy(id = "customer.address.city")
    WebElement cityField;

    @FindBy(id = "customer.address.state")
    WebElement stateField;

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCodeField;

    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumberField;

    @FindBy(id = "customer.ssn")
    WebElement ssnField;

    @FindBy(id = "customer.username")
    WebElement usernameField;

    @FindBy(id = "customer.password")
    WebElement passwordField;

    @FindBy(id = "repeatedPassword")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerButton;

    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully.')]")
    WebElement successMessage;
    
    @FindBy(className = "error")
    WebElement alreadyRegister;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterAddress(String address) {
        addressField.sendKeys(address);
    }

    public void enterCity(String city) {
        cityField.sendKeys(city);
    }

    public void enterState(String state) {
        stateField.sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        zipCodeField.sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void enterSsn(String ssn) {
        ssnField.sendKeys(ssn);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
    
    public String userDetailsAlreadyRegister() {
    	
    	String userDetailsRegisteredAlready=alreadyRegister.getText();
    	
    	return userDetailsRegisteredAlready;
    }

    public boolean isSuccessMessageDisplayed() {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
    	    By.xpath("//p[contains(text(),'Your account was created successfully.')]")));
        return successMessage.isDisplayed();
    }
}

