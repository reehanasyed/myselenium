package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) throws Exception
	{
		// site opening
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		Thread.sleep(2000);
		//first check the display of an element and the go to enabled
		try
		{		
		   if(driver.findElement(By.name("q")).isDisplayed())
		   {
			   if(driver.findElement(By.name("q")).isEnabled())
			   {
				   System.out.println("element is enabled");
			   }
			   else
			   {
				   System.out.println("element is disable");
			   }
		   }
		   else
		   {
			   System.out.println("element is not displayed");
		   }
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
	}

}
