package com.noorteck.qa.test;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.pages.TransferPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://demo.automationtesting.in/Register.html";

		CommonUI commonUIObj = new CommonUI();
		ObjInitialize obj = new ObjInitialize();
		BankTest testobj = new BankTest();
		HomePage homeObj = new HomePage();
		TransferPage transferObj = new TransferPage();
		LoansPage loansObj = new LoansPage();

		commonUIObj.openBrowser("chrome"); // open the browser
		commonUIObj.navigate(url); // navigate to the URL

		testobj.BankTestOne();
		commonUIObj.quitBrowser(); // close the browser
	}

	public void BankTestOne() {
		transferObj.clickTransferFunds();
		transferObj.selectFromoriginAccount("Value", "RainyDay");
		transferObj.SelectDestinationAccount("Value", "Investing");
		transferObj.enterAmount("1000");
		transferObj.enterSsNumber("1234567");
		transferObj.enteratmPin("1235");
		transferObj.clickTransferFunds();

		String expectedText = "Success! Funds successfully transferred.”";
		String actualText = "Success! Funds successfully transferred.”";
		if (actualText.contains(expectedText)) {
			System.out.println("Text verified");
		} else {
			System.out.println("wrong Test");
		}
	}

	public void BankTestTwo() {
		// HomePage homeObj = new HomePage();

		homeObj.clickLoan();
		loansObj.enterName("John Cena");
		loansObj.enterAddress("123 java drive");
		loansObj.selectFromDropDown("Value", "Retirement");
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