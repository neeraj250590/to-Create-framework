package Snapdeal_checkout;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Maven/Desktop/Webriver_Sw/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// int
		// row_count=driver.findElement(By.xpath("//table[@id='customers']")).findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();

		WebElement row_table = driver.findElement(By.xpath("//table[@id='customers']"));

		List<WebElement> row_data = row_table.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

		int row_count = row_data.size();

		// Loop will execute till the last row of table.
		for (int i = 0; i < row_count; i++) {

			// WebElement row_table =
			// driver.findElement(By.xpath("//table[@id='customers']"));
			List<WebElement> column_data = row_data.get(i)
					.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

			int columns_count = column_data.size();
			System.out.println("Number of cells In Row " + row_count + " are " + columns_count);

			// Loop will execute till the last cell of that specific row
			for (int j = 0; j < columns_count; j++) {

				// To retrieve text from that specific cell.
				String celtext = column_data.get(j).getText();
				System.out.println("Cell Value of row number " + i + " and column number " + j + " Is " + celtext);

			}

		}

	}

}