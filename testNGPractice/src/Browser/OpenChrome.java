package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenChrome<WebDriver> {
	
	@Test
	public void hello() {
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumjar\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/#");

}

