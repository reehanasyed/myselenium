package package1;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Appiummobilecall 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the phone number");
		String x=sc.nextLine();
		//set dc to ard and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.activities.TwelveKeyDialer");
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
        	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        	for(int i=0;i<x.length();i++)
        	{
        		char c=x.charAt(i);
        		String y=" ";
        		switch(c)
        		{
        			case '0':
        			y="zero";
        			break;
        			case '1':
            		y="one";
            		break;
        			case '2':
            		y="two";
            		break;
        			case '3':
            		y="three";
            		break;
        			case '4':
            		y="four";
           			break;
        			case '5':
           			y="five";
           			break;
        			case '6':
           			y="six";
           			break;
        			case '7':
           			y="seven";
           			break;
        			case '8':
           			y="eight";
           			break;
        			case '9':
           			y="nine";
           			break;
        		}
        		Thread.sleep(10000);
            	driver.findElement(By.xpath("//*[@content-desc='"+y+"']")).click();
	
        	}
        	
              	
        		driver.findElement(By.xpath("//*[@content-desc='Dial using SIM1']")).click();
        		Thread.sleep(20000);
        		driver.findElement(By.xpath("//*[@resource-id='com.android.incallui:id/endButton']")).click();
                if(driver.findElement(By.xpath("//*[@bounds='[22,1583][1058,1774]']")).isDisplayed())
                {
                   String t=driver.findElement(By.xpath("//*[@bounds='[22,1583][1058,1774]']")).getAttribute("text");
                   System.out.println(t);
                }
                
        		driver.closeApp();
        }
       catch(Exception ex)
   	{
   	   System.out.println(ex.getMessage());	
   	}

                Runtime.getRuntime().exec("taskkill /F /IM node.exe");
                Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
        
	}
}

