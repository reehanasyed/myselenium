package package1;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class Geofence {

	public static void main(String[] args) throws Exception 
	{
		
		//set dc to ard and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("LocationserviceEnabled",true);
		dc.setCapability("LocationserviceAuthorized",true);
		dc.setCapability("appPackage","com.google.android.apps.maps");
		dc.setCapability("appActivity","com.google.android.maps.MapsActivity");
		//start Appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723 \"");
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
//        Thread.sleep(50000);
//        Location l=new Location(27.175015,78.042155,2000);
//        driver.setLocation(l);
//        Thread.sleep(20000);
        Thread.sleep(20000);
		Location L1=new Location(12.959172,77.697419,2000);
		driver.setLocation(L1);
		Thread.sleep(20000);
		Location L2=new Location(-37.813628,144.963058,1000);
		driver.setLocation(L2);
		Thread.sleep(20000);
		Location L3=new Location(17.446362,78.465164,1000);
		driver.setLocation(L3);
		Thread.sleep(20000);
        driver.closeApp();
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");
        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
