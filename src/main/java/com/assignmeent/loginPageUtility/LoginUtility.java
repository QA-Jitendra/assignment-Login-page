package com.assignmeent.loginPageUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUtility {
	@FindBy (xpath="//input[@id='username']")private WebElement username;
	@FindBy (xpath="//input[@id='password']")private WebElement password;
	@FindBy (xpath="//button[@id='log-in']")private WebElement loginbutton;
	
	public LoginUtility(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	public void customerUsername() {
		
		username.sendKeys("Jitendra");
		
	}
	public void customerPassWord() {
		password.sendKeys("12345");
	}
    public void clickLoginButton() {
    	loginbutton.click();
    
    }

}
