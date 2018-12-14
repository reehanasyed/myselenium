package package1;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		driver.findElement(By.name("username")).sendKeys("8977771413");
		driver.findElement(By.name("password")).sendKeys("reehana786");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='out facebooki']")).click();
		Thread.sleep(2000);
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(0));
		Thread.sleep(2000);
        //driver.close();
        //driver.quit();
	
		
	}

}
