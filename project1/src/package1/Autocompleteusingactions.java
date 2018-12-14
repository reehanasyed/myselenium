package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autocompleteusingactions {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Actions a=new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("selenium");
		

	}

}
