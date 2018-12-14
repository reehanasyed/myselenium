package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args)
	{
		//open site
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.findElement(By.id("flights")).click();
		//first find the element is display or not 
		//then find the element is enable or not
		//then observed the element is selected or not
		try
		{
		WebElement e=driver.findElement(By.xpath("(//*[@name='tripType'])[2]"));
		if(e.isDisplayed())
		{
			if(e.isEnabled())
			{
				if(e.isSelected())
				{
					System.out.println("is selected");
				}
				else
				{
					System.out.println("is not selected");
				}
			}
			else
				
			{
				System.out.println("is not enabled");
			}
		}
		else
		{
			System.out.println("is not displayed");
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		driver.close();
		}
	}


