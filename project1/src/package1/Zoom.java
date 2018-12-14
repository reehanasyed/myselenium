package package1;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Zoom {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("appPackage","com.miui.gallery");
		dc.setCapability("appActivity","com.miui.gallery.activity.HomePageActivity");
		//start Appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
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
			try
			{
			WebDriverWait wait=new WebDriverWait(driver,20);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='ALLOW']")));
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='ALLOW']")));
			driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			//Thread.sleep(9000);
		   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Albums']")));
			//driver.findElementByAndroidUIAutomator("new uiSelector(").te
	       driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout'][@bounds='[0,438][267,705]']")).click();
					
				}
				catch(Exception ep)
				{
					TouchAction ta=new TouchAction(driver);
					int w=driver.manage().window().getSize().getWidth();
					int h=driver.manage().window().getSize().getHeight();
					int x1 =(int)(w/2);
					int y1=(int)(h*0.8);
					int x2=(int)(w/2);
					int y2=(int)(h*0.4);
					ta.press(x1,y1).moveTo(x2,y2).release().perform();
					ta.
				}
			}
			

			}
			
	



