package Snapdeal_checkout;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumjar\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/#");

		List<WebElement> Rows = driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr"));
		int rows_count = Rows.size();
		System.out.println("Rows count is " + rows_count);
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td"));
		int columns_count = columns.size();
		System.out.println("Column size is " + columns_count);

		for (int i = 1; i <= rows_count; i++) {

			for (int j = 1; j <= columns_count; j++) {
				String name1 = driver.findElement(By.xpath("//*[@id=\'content\']/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(name1);
				//*[@id="content"]/table/tbody/tr[1]/td[5]
			}
		}

	}

}
