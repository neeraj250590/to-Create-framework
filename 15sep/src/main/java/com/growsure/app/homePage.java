package com.growsure.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
	
	
	
	@FindBy(xpath="")        // Page factory concept
	WebElement text;
	
	public void verifyHeaderContent(WebDriver driver) {
		
		String intArray[]= {"HOME","ABOUT US","COURSES","CORPORATE TRAINING","CONTACT US"};
		
		int size =driver.findElements(By.xpath("//nav/ul/li/a/strong")).size();
		
		for (int i = 1; i <= size; i++) {
			
			String getVAlue = driver.findElement(By.xpath("(//nav/ul/li/a/strong)["+i+"]")).getText();
			System.out.println(getVAlue);
			if(intArray[i-1].contentEquals(getVAlue)){
			/*if(intArray[i-1].compareToIgnoreCase(getVAlue)){*/
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}	
		}
	}

	public void verifyImageContent(WebDriver driver) {

		String App_Logo = driver.findElement(By.xpath("//*[@id='header_logo']")).getAttribute("src");
		System.out.println(App_Logo);
		String Actual_Logo_URL = "https://gsure.in/wp-content/uploads/2018/02/logo_new_design-2.png";

		if (App_Logo.contains(Actual_Logo_URL)) {
			System.out.println("Passed - App logo url is matched");
		} else {
			System.out.println("Failed - Check url is not matched");
		}
	}
}
