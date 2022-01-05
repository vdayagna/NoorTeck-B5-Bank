package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	
	
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']//span[@class='label'][normalize-space()='Transfer']")
	WebElement clickTransfer;
	
	@FindBy(xpath ="//a[@class='ng-star-inserted']//span[@class='label'][normalize-space()='Loans']")
	WebElement clickLoans;
	
	@FindBy(xpath = "//*[text() = 'LogOut']")
	WebElement clickLogOut;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickTransfer() {
		click(clickTransfer);
	}
	public void clickLoans() {
		click(clickLoans);
	}
	public void clickLogOut() {
		click(clickLogOut);
	}
}
