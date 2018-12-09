package Snapdeal_checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkoutScript {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumjar\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.snapdeal.com/product/indulekha-bhringa-oil-100-ml/667473900727");
		
		driver.findElement(By.xpath("//div[text()='Nova NHT 1046 Beard Trimmer White']")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@class=\'buy-block col-xs-20\']/div[2]/span")).click();
	//	driver.findElement(By.xpath("//*[@id='add-cart-button-id']/span")).click();
		driver.findElement(By.xpath("//*[@id=\'add-cart-button-id\']/span")).click();
		
	}

}
