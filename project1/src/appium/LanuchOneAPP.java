package appium;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class LanuchOneAPP {

	public static void main(String[] args) throws Exception 
	{
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
	}

}
