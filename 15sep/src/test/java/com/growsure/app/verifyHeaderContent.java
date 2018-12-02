package com.growsure.app;

import org.testng.annotations.Test;

public class verifyHeaderContent extends baseClass {

	@Test
	public void verifyHeader() {
		try {
			homePage h = new homePage();
			h.verifyHeaderContent(driver);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	@Test
	public void imageVerify() {
		homePage h = new homePage();
		h.verifyImageContent(driver);
	
	}

}
