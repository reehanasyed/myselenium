package package1;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Divwithmultiselect1 {

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
		List<WebElement> l=driver.findElements(By.xpath("//*[@class='menu transition visible']/div"));
		Thread.sleep(2000);
		for(int i=0;i<l.size();i++)
		{
			String x=l.get(i).getAttribute("data-value");
			Thread.sleep(2000);
			System.out.println(x);
		}
		
driver.close();
	}

}
