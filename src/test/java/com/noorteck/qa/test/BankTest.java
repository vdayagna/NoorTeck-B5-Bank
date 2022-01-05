package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.pages.TransferPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://usdemo.vee24.com/#/transactions";

		// CommonUI commonUIObj = new CommonUI();
		// ObjInitialize obj = new ObjInitialize();
		// BankTest testobj = new BankTest();
		// HomePage homeObj = new HomePage();
		// TransferPage transferObj = new TransferPage();
		// LoansPage loansObj = new LoansPage();

		CommonUI.openBrowser("chrome"); // open the browser
		CommonUI.navigate(url); // navigate to the URL
		initializeClassObj();
		BankTestOne();
		BankTestTwo();
		// testobj.BankTestOne();
		CommonUI.quitBrowser(); // close the browser
	}

	public static void BankTestOne() {
		HomePage homeObj = new HomePage();
		SoftAssert softAssert = new SoftAssert();

		homeObj.clickTransfer();
		// transferObj.selectFromOriginAccount();
		// transferObj.clickOriginAccount();
	   // transferObj.SelectDestinationAccount("Value", "Investing");
		// transferObj.clickDestinationAccount();
		transferObj.enterAmount("1000");
		transferObj.enterSsNumber("1234567");
		transferObj.enteratmPin("1235");
		transferObj.clickTransferFunds();
		String actualText = driver.getTitle();
		String expectedText = "Success! Funds successfully transferred.”";
		softAssert.assertEquals(expectedText, actualText);
		
	}

	public static void BankTestTwo() throws InterruptedException {
		HomePage homeObj = new HomePage();
		SoftAssert softAssert = new SoftAssert();

		homeObj.clickLoans();
		loansObj.enterName("John Cena");
		loansObj.enterAddress("123 java drive");
       //loansObj.selectFromDropDown("Value", "Retirement");
	
		loansObj.enterYearsToRepayLoan("2");
		loansObj.clickNext();
		loansObj.enterAmount("5000");
		loansObj.enterSsNumber("123456778");
		loansObj.clickNextButton();
		loansObj.clickConfirm();

		String expectedText = "Submission Success";
		String actualText = "Submission Success";
		if (actualText.contains(expectedText)) {
			System.out.println("Text verified");
		} else {
			System.out.println("wrong Test");

		}
	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */