package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();	
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();

		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(a.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(a.get(1));
		driver.findElement(By.name("q")).click();
		driver.switchTo().window(a.get(2));		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Way2SMS']")).click();
		}

}
