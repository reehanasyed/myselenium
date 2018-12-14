package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Banner {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://www.mindqsystems.com/");
	     driver.manage().window().maximize();
	     if(driver.findElement(By.xpath("//div[@class='text']/img")).isDisplayed())
	     {
	    	 driver.findElement(By.id("closebtn")).click();
	     }
	     WebDriverWait w=new WebDriverWait(driver,20);
	    //w.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo")));
	     WebElement e=  driver.findElement(By.xpath("(//span[@id='dropdownMenu1'])[1]"));
	     Actions a=new Actions(driver);
	     a.moveToElement(e).build().perform();
	     a.sendKeys(Keys.DOWN).build().perform();
	     a.sendKeys(Keys.DOWN).build().perform();
	     a.sendKeys(Keys.ENTER).build().perform();
	     


	}

}
