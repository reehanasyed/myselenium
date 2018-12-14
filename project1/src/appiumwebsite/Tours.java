package appiumwebsite;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Tours {

	public static void main(String[] args) throws Exception 
	{
		//get test environment
		Scanner sc=new Scanner(System.in);
		System.out.println("enter platform as computer/mobile");
		String p=sc.nextLine();
		WebDriver driver;

		if(p.equalsIgnoreCase("computer"))
		{
			System.setProperty("webdriver.chrome.driver","H://chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.close();

		}
		else
		{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		//start Appium server
			Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		    URL u=new URL("http://0.0.0.0:4723/wd/hub");
		     while(2>1)
		     {
		     	try
		     	{
		     		driver=new AndroidDriver(u,dc);
		     		break;
		     	}
		     	catch(Exception ex)
		     	{
		     	}
		     	
		     }
		}
		     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		        driver.get("http://newtours.demoaut.com/mercuryregister.php");
				driver.findElement(By.name("firstName")).sendKeys("reehana");
				driver.findElement(By.name("lastName")).sendKeys("syed");
				driver.findElement(By.name("phone")).sendKeys("8977771413");
				driver.findElement(By.name("address1")).sendKeys("chilakaluripet");
				driver.findElement(By.name("address2")).sendKeys("guntur");
				driver.findElement(By.name("city")).sendKeys("guntur");
				driver.findElement(By.name("state")).sendKeys("andhar pradesh");
				driver.findElement(By.name("postalCode")).sendKeys("522616");
			    WebElement e=driver.findElement(By.name("country"));
			    Select s=new Select(e);
			    s.selectByValue("92");
				driver.findElement(By.name("email")).sendKeys("sams.reehana4@gmail.com");
				driver.findElement(By.name("password")).sendKeys("reehana@786");
				driver.findElement(By.name("confirmPassword")).sendKeys("reehana@786");
				driver.findElement(By.name("register")).submit();
				if(!p.equalsIgnoreCase("computer"))
				{
		     	Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		       
				}


				
	}

}
