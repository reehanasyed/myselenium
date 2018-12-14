package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.name("//*[text()='File']"));
		Actions a=new Actions(driver);
		a.click(e1).build().perform();
		List<WebElement> l=driver.findElements(By.xpath("//*[@class='menu transition visible']"));
		for(int i=0;i<l.size();i++)
		{
			String x=l.get(i).getAttribute("data-value");
			System.out.println(x);
		}
		driver.close();
		

	}

}
