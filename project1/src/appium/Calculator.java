package appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first input");
		String x=sc.nextLine();
		System.out.println("enter the second input");
		String y=sc.nextLine();
		//set dc to ard and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "4.2.2");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
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
        			driver.findElement(By.xpath("//*[@text='"+c+"']")).click();
        		}
        		driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
        		for(int i=0;i<y.length();i++)
        		{
        			char c=y.charAt(i);
        			driver.findElement(By.xpath("//*[@text='"+c+"']")).click();
        		}
        		driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
        		Thread.sleep(2000);
           		String z=driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
        		System.out.println(z);
        		if(Integer.parseInt(z)==Integer.parseInt(x)+Integer.parseInt(y))
        		{
        			System.out.println("test pass");
        			File scr=driver.getScreenshotAs(OutputType.FILE);
        			File dest=new File("cal.png");
        			FileUtils.copyDirectory(scr,dest);	
        		}
        		else
        		{
        			System.out.println("test pass");
        			File scr=driver.getScreenshotAs(OutputType.FILE);
        			File dest=new File("cal.png");
        			FileUtils.copyDirectory(scr,dest);
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
