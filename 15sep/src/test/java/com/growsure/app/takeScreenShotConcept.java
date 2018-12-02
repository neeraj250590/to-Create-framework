package com.growsure.app;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class takeScreenShotConcept extends baseClass {
	
	@Test
	public void takeScreenSht() throws IOException {

		homePage h = new homePage();
		h.capture(driver, "test", "C:\\Users\\Admin\\git\\to-Create-framework\\15sep\\FolderScreen");
		
	}

	}


