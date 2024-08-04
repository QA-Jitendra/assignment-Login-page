package com.assignmeent.loginPageUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomeUtility {

	@FindBy (xpath="//th[@id='amount']")private WebElement amount;

	
	public HomeUtility(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		
//		Assert.assertTrue(driver.getTitle().contains("HOME"));
//		
//		Assert.assertFalse(driver.getTitle().contains("HOME"));
//		Assert.assertTrue(true);
//		
	}
	public void clickamount() {
		
		amount.click();
		
		

}
}