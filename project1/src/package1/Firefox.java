package package1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.Key;

public class Firefox {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","H:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//open fb page
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		WebElement e=driver.findElement(By.xpath("//*[text()='Create a Page']"));
		Actions a=new Actions(driver);
		a.contextClick(e);
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_UP);
		a.sendKeys(Keys.ARROW_UP);
		a.sendKeys(Keys.ARROW_UP);
		a.sendKeys(Keys.ARROW_UP);
		a.sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		//driver.close();

	}

}
