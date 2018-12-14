package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hightlightelement {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		WebElement e=driver.findElement(By.xpath("(//*[@class='ui dropdown selection'])[1]"));
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(3000);
		js.executeScript("arguments[0].style.border='2px dotted blue';",e);
		Thread.sleep(3000);
		driver.close();

	}

}
