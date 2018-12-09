package Snapdeal_checkout;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableOne {
		
			public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","C:/Users/Maven/Desktop/Webriver_Sw/chromedriver_win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://www.w3schools.com/html/html_tables.asp");

			//*[@id="customers"]/tbody/tr[2]/td[1]
			//*[@id="customers"]/tbody/tr[2]/td[2]
			//*[@id="customers"]/tbody/tr[2]/td[3]
			
			String BeforeXpath = "//*[@id=\'customers\']/tbody/tr[";
			String AfterXpath = "]/td[1]";
			
			/*List  < WebElement > rows = driver.findElements(By.xpath(BeforeXpath+AfterXpath));
			int Rows_count = rows.size();
			
			System.out.println(Rows_count);*/
			
			for (int i = 2; i<= 7; i++) {
				
				String name = driver.findElement(By.xpath(BeforeXpath+i+AfterXpath)).getText();
			
				//System.out.println(name);
				
				if (name.contentEquals("Island Trading")) {
					System.out.println("TestCase is pass");
					break;
				}
				else {
					System.out.println("Failed");
					break;
				}
			}
					
	}

}
