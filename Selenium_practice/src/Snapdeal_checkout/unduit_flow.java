package Snapdeal_checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class unduit_flow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\seleniumjar\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://unduit.com/uat/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='unduit-menu']//a[@id='signinmodel']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("cpr@mailinator.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("ajaxsignin")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@id='rightNav']/li/a[contains(text(),'My Dashboard ')]")).click();
		Thread.sleep(3000);
		
	//	driver.navigate().to("https://unduit.com/uat/corporate_new/order_preview");
		
		driver.findElement(By.xpath("//*[@class='icon']/following-sibling::div/span[text()='Repair']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='bulk_order']")).click();
		Thread.sleep(2000);
		
		
		// Uploading invalid file
		driver.findElement(By.xpath("//*[@name='order_file']")).sendKeys("C:\\Users\\Admin\\Desktop\\upload\\pdf\\sample.pdf");
		System.out.println("Uploaded invalid pdf file");
		
		driver.findElement(By.xpath("//*[@id='order_submit_b']")).click();
		
		driver.findElement(By.xpath("//*[@name='order_file']")).sendKeys("C:\\Users\\Admin\\Desktop\\upload\\demo.docx");
		System.out.println("Uploaded invalid Docx file");
		
		driver.findElement(By.xpath("//*[@id='order_submit_b']")).click();
		
		// Uploading valid file 
		driver.findElement(By.xpath("//*[@name='order_file']")).sendKeys("C:\\Users\\Admin\\Desktop\\upload\\Bulk_Order_Upload_Template.xlsx");
		
		driver.findElement(By.xpath("//*[@id='order_submit_b']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='priority-shipment-btn']/img[2]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@class='text-right']/a[contains(text(),'Tag Device')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='right-confirmation-bar unduit-show-right-confirmation-bar']/div[@class='rc-bar-header']/h4[text()='Tag Device']/following-sibling::a[@class='close-right-nav pull-right']")).click();
		
		
		
	}

}
