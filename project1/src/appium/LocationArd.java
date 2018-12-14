package appium;

import java.net.URL;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LocationArd {

	public static void main(String[] args) throws Exception 
	{
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
		        Thread.sleep(50000);
		        
				/*Location l1=new Location(12.959172,77.697419,2000);
				driver.setLocation(l1);
				Thread.sleep(50000);*/
				Location l2=new Location(37.813628,144.963058,2000);
				driver.setLocation(l2);
				Thread.sleep(50000);
				/*Location l3=new Location(17.446362,78.465164,1000);
				driver.setLocation(l3);
				Thread.sleep(50000);*/
		       
		        // driver.close();
				//stop Appium server
				Runtime.getRuntime().exec("taskkill /F /IM node.exe");
				Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
				

	}

}
