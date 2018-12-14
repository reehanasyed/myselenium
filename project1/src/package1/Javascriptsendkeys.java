package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptsendkeys {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "H://geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('lst-ib').value='selenium';");
		
		

	}

}
