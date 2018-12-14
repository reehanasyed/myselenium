package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stubor 
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.linkText("CSS"));
		String x=e.getAttribute("title");
		System.out.println(x);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e1=driver.findElement(By.xpath("//*[text()='Demo: Tooltip Examples']"));
		js.executeScript("arguments[0].scrollIntoView();", e1);
		WebElement e2=driver.findElement(By.xpath("(//*[@class='tooltip'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(e2).clickAndHold().build().perform();
		Thread.sleep(4000);
		WebElement e3=driver.findElement(By.xpath("//*[@class='tooltiptext tooltip-top']"));
		String y=e3.getText();
		System.out.println(y);
		a.release().build().perform();

		

	}

}
