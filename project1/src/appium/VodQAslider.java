package appium;

import java.io.IOException;
import java.net.MalformedURLException;
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

public class VodQAslider {

	public static void main(String[] args) throws IOException 
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
      WebDriverWait w1=new WebDriverWait(driver,29);
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
      driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Slider']")));
      driver.findElement(By.xpath("//*[@text='Slider']")).click();
      w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='slider']")));
     WebElement e=driver.findElement(By.xpath("//*[@content-desc='slider']"));
     int ex1=e.getLocation().getX();
     int ey1=e.getLocation().getY();
     int ex2=ex1+300;
     int ey2=ey1;
     TouchAction ta1=new TouchAction(driver);
     Duration d=Duration.of(10,ChronoUnit.SECONDS);
     ta1.press(ex1,ey1).waitAction(d).moveTo(ex2,ey2).release();
     WebElement e1=driver.findElement(By.xpath("//*[@content-desc='slider1']"));
     int e1x1=e1.getLocation().getX();
     int e1y1=e1.getLocation().getY();
     int e1x2=e1x1+300;
     int e1y2=e1y1;
     TouchAction ta2=new TouchAction(driver);
     ta2.press(e1x1,e1y1).waitAction(d).moveTo(e1x2,e1y2).release();
     MultiTouchAction m=new MultiTouchAction(driver);
     m.add(ta1).add(ta2).perform();
     w1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='0']")));
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
     Runtime.getRuntime().exec("taskkill /F /IM node.exe");
     Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
     
     
      
	
	}

}
