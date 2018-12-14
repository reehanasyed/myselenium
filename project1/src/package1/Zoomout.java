package package1;

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
import io.appium.java_client.android.AndroidKeyCode;

public class Zoomout {

	public static void main(String[] args) throws IOException 
	{
		//Details of ARD&APP
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		//dc.setCapability("automationName","uiautomator2");
		dc.setCapability("appPackage","com.miui.gallery");
		dc.setCapability("appActivity","com.miui.gallery.activity.HomePageActivity");
		//start Appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723 \"");
        URL u=new URL("http://0.0.0.0:4723/wd/hub");
		//create driver object to Launch app
		AndroidDriver driver;
		while(6>4)
		{
			try 
			{
				driver=new AndroidDriver(u,dc);
				break;
			}
			catch(Exception e)
			{
		}
	}
		//Automation
	 		try
	 		{
	 		WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
			driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Photo View']")));
			driver.findElement(By.xpath("//*[@text='Photo View']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.ImageView']")));
			WebElement e=driver.findElement(By.xpath("//*[@class='android.widget.ImageView']")); 
			
			TouchAction ta1=new TouchAction(driver);
			Duration d=Duration.of(5,ChronoUnit.SECONDS);
			ta1.press(800,1000).waitAction(d).moveTo(200,1000).release();
//			TouchAction ta2=new TouchAction(driver);
//			ta2.press(e).waitAction(d).moveTo(e).release();
//			MultiTouchAction ma=new MultiTouchAction(driver);
//			ma.add(ta1).add(ta2).perform();
	 		}
			catch(Exception ex)
	 		{
				System.out.println("zoom out failed");
	 		}
	}
	}

