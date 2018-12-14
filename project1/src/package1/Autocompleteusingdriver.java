package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autocompleteusingdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Actions a=new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("selenium");
		for(int i=1;i<=7;i++)
		{
		 a.sendKeys(Keys.DOWN).build().perform();
		 Thread.sleep(2000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
         driver.close();
	}

}
