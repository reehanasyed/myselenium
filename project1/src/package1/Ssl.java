package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ssl {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stubedVC
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://www.google.co.in");
	    driver.close();

	}

}
