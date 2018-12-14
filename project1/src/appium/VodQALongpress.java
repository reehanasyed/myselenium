package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class VodQALongpress {

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
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Long Press']")));
      driver.findElement(By.xpath("//*[@text='Long Press']")).click();
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='longpress']")));
      driver.findElement(By.xpath("//*[@content-desc='longpress']")).click();
      
     }catch(Exception ep)
     {
    	 System.out.println(ep.getMessage());
     }
	}

}
