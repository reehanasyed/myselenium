package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtoframes {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open way2sms site
		driver.get("http://www.way2sms.com/entry?ec=0080&id=0.19711070533430175");
		Thread.sleep(1000);
		//login
		driver.findElement(By.name("username")).sendKeys("8977771413");
		driver.findElement(By.name("password")).sendKeys("reehana786");
		driver.findElement(By.id("loginBTN")).click();
		//click on send sms link
		driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
		Thread.sleep(3000);
		//switch to frame
	    driver.switchTo().frame("frame");
        driver.findElement(By.name("mobile")).sendKeys("7396978883");
        Thread.sleep(3000); 
		driver.findElement(By.name("message")).sendKeys("hiii hello");
		Thread.sleep(2000);
		driver.findElement(By.name("Send")).click();
		//driver.findElement(By.name("Send")).click();
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("(//*[@src='ext_images/close-ext.png'])[1]")).click();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='out louti']")).click();
        driver.close();
	}
	}
