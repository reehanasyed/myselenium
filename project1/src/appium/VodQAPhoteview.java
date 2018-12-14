package appium;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class VodQAPhoteview {

	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		//dc.setCapability("automationName","uiautomator2");
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
      WebDriverWait w1=new WebDriverWait(driver,100);
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
      driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Photo View']")));
      WebElement p=driver.findElement(By.xpath("//*[@text='Photo View']"));
      TouchAction ta=new TouchAction(driver);
      ta.tap(p).release().perform();
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.ImageView']")));

      WebElement e=driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
      TouchAction ta1=new TouchAction(driver);  
      ta1.press(e,300,1000).waitAction(Duration.ofMillis(5000)).moveTo(e,100,1000).release();
      WebElement e1=driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
      TouchAction ta2=new TouchAction(driver);
      ta2.press(e1,400,1000).waitAction(Duration.ofMillis(5000)).moveTo(e1,800,1000).release();
      MultiTouchAction ma=new MultiTouchAction(driver);
      ma.add(ta1).add(ta2).perform();
      Thread.sleep(15000);

	}catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
     Runtime.getRuntime().exec("taskkill /F /IM node.exe");
     Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
