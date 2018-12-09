package Snapdeal_checkout;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\seleniumjar\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/#");
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"content\"]/table/thead/tr/th"));
		int columns_count = columns.size();
		System.out.println("Column size is "+columns_count);
		
		for (int i = 1; i <= columns_count ; i++) {
			String name1 = driver.findElement(By.xpath("//*[@id=\'content\']/table/thead/tr/th["+i+"]")).getText();
			System.out.println(name1);
			//*[@id="content"]/table/thead/tr/th[6]
		}
		//*[@id="content"]/table/tbody/tr[2]/td[1]
		List <WebElement> Rows= driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr"));
		int rows_count= Rows.size();
		System.out.println("Rows count is " + rows_count);
		
		for (int i = 1; i <=rows_count; i++) {
			
			String rows_data = driver.findElement(By.xpath("//*[@id=\'content\']/table/tbody/tr["+i+"]/th")).getText();
			System.out.println(rows_data);
		}
	}

}
