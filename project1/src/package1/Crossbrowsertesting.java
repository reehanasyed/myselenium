package package1;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Crossbrowsertesting {

	public static void main(String[] args) throws Exception 
	{
      //open a site
	  //Thread.sleep(3000);
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the browser name");
      String x=sc.nextLine();
	  WebDriver driver=null;
	  if(x.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if(x.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 driver=new FirefoxDriver();
	  }
	  else
	  {
		  System.out.println("unknown");
	  }
	  driver.get("https://www.instagram.com");
	  File src=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("H:\\batch239\\max.png");
		FileUtils.copyFile(src,dest);
	  
	  driver.close();
	}

}
