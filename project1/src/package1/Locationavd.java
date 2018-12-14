package package1;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Locationavd {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.deskclock");
		dc.setCapability("appActivity","com.android.deskclock.DeskClock");
		//start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		//create driver object to launch app
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
		//automate app screens
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Cities']")));
			driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
			driver.context("NATIVE_APP");
	        //perform swipe for required element(city)
		       int w=driver.manage().window().getSize().getWidth();
		       int h=driver.manage().window().getSize().getHeight();
		       TouchAction ta=new TouchAction(driver);
		       //swipe from bottom to top
		         int x1=(int)(w/2);
		         int x2=x1;
		         while(2>1)//infinite loop
		        {
			       try
			       {
				    WebElement e1=driver.findElement(By.xpath("//*[@text='Black Rock City']"));
				    e1.click();
				    
				    System.out.println(e1.getAttribute("class"));
				      break;//terminate from loop
			       }
			         catch(Exception ex)
			         {
			           	 int y1=(int)(h*0.9);
				         int y2=(int)(h*0.3);
   				         ta.press(x1,y1).moveTo(x2,y2).release().perform();
			         }
		         }
		        //swipe from top to bottom for required city
		         
		         while(2>1)
		         {
		        	 try
		        	 {
		        		 driver.findElement(By.xpath("//*[@text='Amman']")).click();
		        		 break;//terminate from loop
		        	 }
		        	 catch(Exception e)
		        	 {
		        		int y1=(int)(h*0.3);
				        int y2=(int)(h*0.9);
		        		 ta.press(x1,y1).moveTo(x2,y2).release().perform();
		        	 }
		         }
			     //close app
		         driver.closeApp();
		}
		       catch(Exception exc)
		{
		    	   System.out.println(exc.getMessage());
		}
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");
        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
