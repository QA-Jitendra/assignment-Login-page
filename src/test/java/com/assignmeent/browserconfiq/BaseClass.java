package com.assignmeent.browserconfiq;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void openbrowser() {
		driver=new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	public static void closeBrowser() {
		driver.close();
	}

}
