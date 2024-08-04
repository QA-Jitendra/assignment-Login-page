package com.assignmeent.browserconfiq;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.assignmeent.loginPageUtility.HomeUtility;
import com.assignmeent.loginPageUtility.LoginUtility;
import com.assignmeent.loginPageUtility.SortUtility;

public class AmountTest extends BaseClass {
	HomeUtility hu;
	LoginUtility lu;
	SortUtility su;
	
	
	@BeforeClass
	public void browserOpen() {
		openbrowser();
		
		
	}
	@Test
	public void asssignmentTest() {
		lu = new LoginUtility(driver);
		hu = new HomeUtility(driver);
		su = new SortUtility(driver);
		
	lu.customerUsername();
	lu.customerPassWord();
	lu.clickLoginButton();
    su.tableBeforsorting();
    su.clickOnAmountButton();
    su.tableAftersorting();
    
   


   
	
	}
	@AfterClass
	public void browserClose() {
		closeBrowser();
	}
	
			
}
