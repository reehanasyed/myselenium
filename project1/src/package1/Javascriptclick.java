package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptclick 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("(//*[text()='Gmail'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
        js.executeScript("arguments[0].click();",e);
        

	}

}
