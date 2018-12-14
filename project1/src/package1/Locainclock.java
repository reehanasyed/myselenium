package package1;

import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Locainclock {

	public static void main(String[] args) throws Exception 
	{
		
		//set dc to ard and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.deskclock");
		dc.setCapability("appActivity","com.android.deskclock.worldclock.CitiesActivity");
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
        try
        {
        WebDriverWait wt=new WebDriverWait(driver,50);
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Cities'][@index='1']")));
        driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
        driver.context("NATIVE_APP");
        int w=driver.manage().window().getSize().getWidth();
        int h=driver.manage().window().getSize().getHeight();
        TouchAction ta=new TouchAction(driver);
        int X1 =(int)(w/2);
        int y1=(int)(h*0.7);
        int X2=(int)(w/2);
        int y2=(int)(h*0.4);
       while(2>1)
       {
          try 
        	{
        	 driver.findElement(By.xpath("//*[@text='Bangalore']")).click();
        	 break;
        	}
        	
       	catch(Exception e)
        	{
        		ta.press(X1, y1).moveTo(X2, y2).release().perform();
        	}
       }
      driver.closeApp();
  }
        
        catch(Exception ep)
        {
        	System.out.println(ep.getMessage());
		}
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");
        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
        }
}


