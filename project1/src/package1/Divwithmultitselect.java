package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Divwithmultitselect {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(2000);
		//Select s=new Select();
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']")).click();
		Thread.sleep(2000);
		while(2>1)
		{
		   	String x=driver.findElement(By.xpath("(//*[@class='item selected'])[1]")).getAttribute("data-value");
		   	if(x.equalsIgnoreCase("css"))
		   	{
		   		a.sendKeys(Keys.ENTER).build().perform();
		   		Thread.sleep(2000);
		   		break;
		   	}
		   	else
		   	{
		   		a.sendKeys(Keys.DOWN).build().perform();
		   	}
		   	
		   	
		}
		driver.close();
	}

}
