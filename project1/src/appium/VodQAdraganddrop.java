package appium;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class VodQAdraganddrop {

	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("appPackage","com.vodqareactnative");
		dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
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
     //automation
     try
     {
    	 
      WebDriverWait w1=new WebDriverWait(driver,30);
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
      driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Drag & Drop']")));
      driver.findElement(By.xpath("//*[@text='Drag & Drop']")).click();
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Drag me!']")));
      WebElement e1=driver.findElement(By.xpath("//*[@text='Drag me!']"));
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Drop here.']")));
      WebElement e2=driver.findElement(By.xpath("//*[@text='Drop here.']"));
      TouchAction ta=new TouchAction(driver);
      ta.press(e1).moveTo(e2).release().perform();
      try
      {
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Circle dropped']")));
      if(driver.findElement(By.xpath("//*[@text='Circle dropped']")).isDisplayed())
      {
    	  System.out.println("successfully droped");
      }
      else
      {
    	  System.out.println("failed to drop");
      }
     }catch(Exception ex)
     {
    	 System.out.println(ex.getMessage());
     }
     }catch(Exception ep)
     {
    	 System.out.println(ep.getMessage());

     }
     Runtime.getRuntime().exec("taskkill /F /IM node.exe");
     Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
