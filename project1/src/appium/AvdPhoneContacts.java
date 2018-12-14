package appium;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AvdPhoneContacts {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the phone number");
		String x=sc.nextLine();
		//set dc to ard and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","4.2.2");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.activities.DialtactsActivity");
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
            	driver.findElement(By.xpath("//*[@content-desc=' " +y+ " ']")).click();
            	}
        		driver.findElement(By.xpath("//*[@content-desc='dial']")).click();
        		Thread.sleep(100000);
        		driver.findElement(By.xpath("//*[@content-desc='End']")).click();
	}
        	catch(Exception ex)
           	{
	   	   System.out.println(ex.getMessage());	
	   	}

	                Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	                Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	        

	}

}
