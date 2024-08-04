package com.assignmeent.loginPageUtility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SortUtility {
	String amt;
	String amttr;
	@FindBy(xpath="//table[@id='transactionsTable']/tbody/tr/td[5]")private List<WebElement> amountlist;
	@FindBy(xpath="//th[@id='amount']")private WebElement amountclick;
	@FindBy(xpath="//table[@id='transactionsTable']/tbody/tr/td[5]")private List<WebElement> afteramounttransaction;
	public SortUtility(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void tableBeforsorting() {
		for(int j=0; j<=0; j++) {
			System.out.println("Before sort amount");
		
	for(int i=0; i<amountlist.size(); i++) {
		amt=amountlist.get(i).getText();
	
		System.out.println(amt+ ",");
		
	}
		
	}
	
	}
	
	public void tableAftersorting() {
		for(int j=0; j<=0; j++) {
			System.out.println("After sort amount");
			
		for(int i=0; i<afteramounttransaction.size(); i++) {
			amttr =afteramounttransaction.get(i).getText();
			System.out.println(amttr+ ",");
				
		}
			
		}
		
		}
	public void clickOnAmountButton() {
		
		
		amountclick.click();
	}
	
	
	
}
