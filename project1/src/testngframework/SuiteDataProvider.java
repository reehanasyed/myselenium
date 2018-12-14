package testngframework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteDataProvider 
{
	WebDriver driver=null;
	@Test(priority=0)
	@Parameters({"google"})
	
	  public void launch(String a) throws Exception 
	  {
		
			System.setProperty("webdriver.gecko.driver","H:\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("http://www.google.co.in");
	  }
	@Test(priority=1)
	@Parameters({"bing"})
	public void launch1()
	{
				System.setProperty("webdriver.gecko.driver","H:\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.bing.com/");
				

	  }
	  @Test(priority=2,dependsOnMethods="launch")
	  @Parameters({"searchword"})
	  public void search(String x) throws Exception
	  {
		 driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER); 
		Thread.sleep(3000);
		
		
	  }
	  @Test(priority=2,dependsOnMethods="launch1")
	  @Parameters({"searchword"})
	  public void search1(String x) throws Exception
	  {
		driver.findElement(By.id("sb_form_q")).sendKeys(x,Keys.ENTER); 
		Thread.sleep(3000);
			
	  }
	  @Test(priority=3)
	  public void close()
	  {
		  driver.close();
	  }
}


