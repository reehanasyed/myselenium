package package1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Testappium {

	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "60c18edf");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "7.1.1");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
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
        		driver.findElement(By.xpath("//*[@text='9']")).click();
        		driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
        		driver.findElement(By.xpath("//*[@text='3']")).click();
        		driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
        		Thread.sleep(10000);
        		String x=driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@bounds='[870,725][1008,904]']")).getAttribute("text");
        		System.out.println(x);
        	}
        	catch(Exception ex)
        	{
        		System.out.println(ex.getMessage());
        	}
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");
        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
        
        }
	}



