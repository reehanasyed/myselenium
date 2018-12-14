package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java1 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("(//*[@class='ui fluid selection dropdown'])[1]"));
		Actions a=new Actions(driver);
        a.click(e1).build().perform();
		Thread.sleep(2000);
		for(int i=0;i<=2;i++) {
		a.sendKeys(Keys.DOWN).build().perform();
		}
		
		a.sendKeys(Keys.ENTER).build().perform();
	}

}
