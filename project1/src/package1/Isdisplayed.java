package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) throws Exception 
	{
		// site opening
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		//find a element in the webpage that is displayed or not
		try
		{
		if(driver.findElement(By.name("dsf")).isDisplayed())
		 {
			System.out.println("is displayed");
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
