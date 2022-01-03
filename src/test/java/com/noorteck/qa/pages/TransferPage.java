package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI{

	

	@FindBy(xpath = "//*[@class = mat-select-placeholder ng-tns-c12-2 ng-star-inserted")
	WebElement originAccount;
	
	@FindBy(xpath = "//*[@class = 'mat-select-placeholder ng-tns-c12-4 ng-star-inserted']")
	WebElement DestinationAccount;
	
	@FindBy(css = "#mat-input-0")
	WebElement totalAmount;
	
	@FindBy(css ="#mat-input-1")
	WebElement enterSsNumber;
	
	@FindBy(css ="#mat-input-2")
	WebElement enteratmPin;
	
	@FindBy(xpath ="//*[text()= 'Transfer Funds']")
	WebElement clickTransferFunds;
	
	//need successful message
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	public void selectOriginAccount(String account) {
		enter(originAccount, account);
	}
	public void enterDestinationAccount(String account) {
		enter(DestinationAccount, account);
	}
	public void enterAmount(String amount) {
		enter(totalAmount, amount);
	}
	public void enterSsNumber(String ssNumber) {
		enter(enterSsNumber, ssNumber);
	}
	public void enteratmPin(String Pin) {
		enter(enteratmPin, Pin);
	}
	public void clickTransferFunds() {
		click(clickTransferFunds);
	}
	public void selectFromoriginAccount(String Value,String RainyDay) {
	
		
	}
	public void SelectDestinationAccount(String Value, String Investing) {
	
		
	}
	
		
	}

