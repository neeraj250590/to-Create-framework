package com.growsure.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class baseClass {
	public WebDriver driver;
	@BeforeSuite
	public void toInvokeURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\to-Create-framework\\15sep\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gsure.in/");
		//driver.get("https://gsure.in/");https://github.com/shaktiautoqa/testGitHub.git
	}
	
	@AfterSuite
	public void toCloseBrowser() {
		driver.quit();
	}
}
