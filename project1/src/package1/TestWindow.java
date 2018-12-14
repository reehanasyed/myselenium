package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindow {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@src,'images/android-button.png')]")).click();
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='About Google']")).click();
		driver.switchTo().window(a.get(0));
		driver.findElement(By.name("username")).sendKeys("8977771413");
		driver.findElement(By.name("password")).sendKeys("reehana786");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(2000);

	}

}
