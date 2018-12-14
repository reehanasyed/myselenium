package package1;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.Connection;

public class Zoomoutappium {

	public static void main(String[] args) throws IOException, InterruptedException  
	{
		//set dc to ard and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","ZY223GF6DK");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
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
        }   Thread.sleep(5000);
        	driver.pressKeyCode(AndroidKeyCode.HOME);
        	Thread.sleep(5000);
        	Connection c=driver.getConnection();
        	if(c.compareTo(Connection.DATA)==0)
        	{
        		System.out.println("data is ON");
        	}
        	else
        	{
        		System.out.println("data is OFF");
        	}
        	driver.setConnection(Connection.NONE);
        	/*WebDriverWait wait=new WebDriverWait(driver,100);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Apps']")));
			driver.findElement(By.xpath("//*[@content-desc='Apps']")).click();
        
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search Apps…']")));
			driver.findElement(By.xpath("//*[@text='Search Apps…']")).click();
			driver.findElement(By.xpath("//*[@text='Search Apps…']")).sendKeys("q");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='QuickPic']")));
			driver.findElement(By.xpath("//*[@text='QuickPic']")).click();
			Thread.sleep(30000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@bounds='[734,71][856,193]']")));
			driver.findElement(By.xpath("//*[@bounds='[734,71][856,193]']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.EditText']")));
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("down");
			driver.findElement(By.xpath("//*[@text='OK']")).click();
			Thread.sleep(10000);
			TouchAction ta=new TouchAction(driver);
			ta.press(181,388).release().perform();
			Thread.sleep(3000);
			ta.press(181,388).release().perform();*/
			
			
			
			
			
			
			
				/*int w=driver.manage().window().getSize().getWidth();
				int h=driver.manage().window().getSize().getHeight();
				TouchAction ta=new TouchAction(driver);
				int x1=(int)(w/2);
				int y1=(int)(h*0.8);
				int x2=x1;
				int y2=(int)(h*0.3);
				ta.press(x1,y1).waitAction(Duration.ofMillis(5000)).moveTo(x2,y2).release().perform();*/
			
			
	
			
			
			
        	
        	
        	
        }
}
	



