package appiumwebsite;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Google
{

	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		//start Appium server
			Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		    URL u=new URL("http://0.0.0.0:4723/wd/hub");
		    AndroidDriver driver;
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
		        driver.get("http://www.google.co.in");
		        WebDriverWait w=new WebDriverWait(driver,20);
				w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
				driver.findElement(By.name("q")).click();
				w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
                driver.findElement(By.name("q")).sendKeys("hello");
		     	driver.closeApp();
		     	Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
}

}


