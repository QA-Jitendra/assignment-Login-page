package com.assignmeent.loginPageUtility;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeUtility {

	@FindBy (xpath="//th[@id='amount']")private WebElement amount;

	
	public HomeUtility(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	
		
	}
	public void clickamount() {
		
		amount.click();
		
		

}
}