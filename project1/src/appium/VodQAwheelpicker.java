package appium;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class VodQAwheelpicker {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Red/blue/green/black");
	     String cname=sc.nextLine();
	     int count=0;
	     int percentage;
	     Color ec=null;
	     switch(cname)
	     {
	     case "black":
	    	 ec=Color.BLACK;
	    	 break;
	     case "red":
	    	 ec=Color.RED;
	    	 break;
	     case "green":
	    	 ec=Color.GREEN;
	    	 break;
	     case "blue":
	    	 ec=Color.BLUE;
	    	 break;
	    default:
	    	System.out.println("wrong color");
	    	System.exit(0);
	    	
	     }
	
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
    	 while(2>1)
    	 {
    		 try
    		 {
    	    	 driver.findElement(By.xpath("//*[@text='Wheel Picker']")).click();
    	    	 break;
    	    	 

    		 }catch(Exception e)
    		 {
    			 TouchAction ta=new TouchAction(driver);
    			 driver.context("NATIVE_APP");
    			 int w=driver.manage().window().getSize().getWidth();
    			 int h=driver.manage().window().getSize().getHeight();
    			 int x1=w/2;
    			 int y1=(int)(h*0.9);
    			 int x2=w/2;
    			 int y2=(int)(h*0.4);
    			 ta.press(x1, y1).moveTo(x2,y2).release().perform();
    		 }
    	 }
    	 w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.TextView']")));
    	 driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click();
    	 w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Spinner']")));
    	 driver.findElement(By.xpath("//*[@class='android.widget.Spinner']")).click();
         w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.ListView']")));
    	 driver.findElement(By.xpath("//*[@text='"+cname+"']")).click();
    	 WebElement e=driver.findElement(By.xpath("//*[@bounds='[0,259][1080,397]']"));
    	 //get location of element in screen
    	 int x=e.getLocation().getX();
    	 int y=e.getLocation().getY();
    	 //get the element width and height
    	 int ew=e.getSize().getWidth();
    	 int eh=e.getSize().getHeight();
    	 //get entire page screenshot
    	 File pf=driver.getScreenshotAs(OutputType.FILE);
    	 BufferedImage b=ImageIO.read(pf);
    	 //crop full screenshot to get element screenshot
    	 BufferedImage es=b.getSubimage(x, y, ew, eh);
    	 //check image color to validate
    	 
	}catch(Exception ep)
     {
   	 System.out.println(ep.getMessage());
    }
    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
    driver.closeApp();
     
     }
	}
     


