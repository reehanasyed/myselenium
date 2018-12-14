package appiumwebsite;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Youtube {

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
		     System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		     driver.get("http://www.youtube.com");
		     driver.context("NATIVE_APP");
		     WebDriverWait w=new WebDriverWait(driver,100);	  
		 try
			 {
		     	 //w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Settings']")));
				     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Account']")));
				     driver.findElement(By.xpath("//*[@text='Account']")).click();	
				     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.EditText']")));
				     driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("sachin tendulkar");
				     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search YouTube']")));
				     driver.findElement(By.xpath("//*[@text='Search YouTube']")).click();
				     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.view.View'][@index='5']")));
				     driver.findElement(By.xpath("//*[@class='android.view.View'][@index='5']")).click();
				     w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='YouTube Video Player']")));
			         WebElement e=driver.findElement(By.xpath("//*[@text='YouTube Video Player']"));
		             TouchAction ta=new TouchAction(driver);
		             ta.tap(e);
		             TouchAction ta1=new TouchAction(driver);
		             ta1.waitAction(Duration.ofMillis(10)).tap(e);                                                                                                      
		             MultiTouchAction ma=new MultiTouchAction(driver);
		             ma.add(ta).add(ta1).perform();
		             w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='enter full screen']")));
				     driver.findElement(By.xpath("//*[@text='enter full screen']")).click();
				     
		             w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='play']")));
				     driver.findElement(By.xpath("//*[@text='play']")).click();
				    // String x=driver.getOrientation().name();
//				     if(x.equalsIgnoreCase("portrait"))
//				     {
//				    	 driver.rotate(ScreenOrientation.LANDSCAPE);
//				    	 
//				     }    
		             
			     }
			     catch(Exception ex)			     
		        {
			       System.out.println(ex.getMessage()); 
			       Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			       Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		        }
	}

}
