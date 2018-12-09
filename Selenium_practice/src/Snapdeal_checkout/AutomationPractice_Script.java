package Snapdeal_checkout;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice_Script {

		public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\\\seleniumjar\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/");
		Thread.sleep(2000);
		//WebDriverWait wai = new WebDriverWait(driver, 3000);
		driver.findElement(By.xpath("//*[@id='onesignal-popover-cancel-button']")).click();

		//WebDriverWait wait = new WebDriverWait(driver, 10000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='mc-closeModal']")).click();


		WebElement element = driver.findElement(By.xpath("//span[text()='Features']"));

		Actions a = new Actions(driver);
		a.moveToElement(element).click(driver.findElement(By.xpath("//a[text()='Flights Module']"))).build().perform();

		Thread.sleep(2000);
		//WebElement tab = driver.findElement(By.xpath("//span[text()='Login']"));
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		//driver.findElement(By.xpath("//span[text()='Login']")).sendKeys(Keys.CONTROL,"t");

		//String selectLinkOpeninNewTab = Keys.chord();
		driver.findElement(By.xpath("//*[@class='login']")).click();
		//driver.findElement(By.linkText("https://phptravels.org/clientarea.php")).sendKeys(Keys.CONTROL+"t");
		Iterator<String> windowIterator = (Iterator<String>) driver.getWindowHandles();
		  while(windowIterator.hasNext()) { 
		    String windowHandle = windowIterator.next(); 
		    if (driver.switchTo().window(windowHandle).getTitle().equals("Client Area - PHPTRAVELS")) {
		      break;
		    }
		  }

		/*Thread.sleep(2000);
		driver.findElement(By.xpath("inputEmail")).sendKeys("neeraj@mailinator.com");
		driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@name='rememberme']")).click();
		driver.findElement(By.xpath("//*[@id='login']")).click();
		*/


		}

		}

	
