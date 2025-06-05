package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetailsPage extends BasePage {

	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement accountsOverviewHeader;
	
	@FindBy(xpath="//td[contains(text(),'*Balance includes deposits that may be subject to ')]")
	WebElement verifiedAccountPage;

	public AccountDetailsPage(WebDriver driver) {
		super(driver);
	}

	public String isAccountsOverviewHeaderDisplayed() {
		
		String logoutBtn=accountsOverviewHeader.getText();
		
		return logoutBtn;
	}
	
    public String isTextAvailableInAccounts() {
		
		String account=verifiedAccountPage.getText();
		
		System.out.println(account);
		
		return account;
	}
		
}
