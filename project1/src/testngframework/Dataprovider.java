package testngframework;

import java.io.File;import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Dataprovider {
	WebDriver driver=null;
	
	@DataProvider(name="searchword")
	public Object[][] testdata()
	{
		return new Object[][]
				{
					{"moon"},
					{"stars"},
					{"sky"},
					{"trees"}
				};
		
	}
	
  @BeforeMethod
  public void launch() throws Exception 
  {	  
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the browser name");
    String x=sc.nextLine();
	  if(x.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		  driver=new ChromeDriver();
			driver.get("http://www.google.co.in");  

	  }
	  else if(x.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","H:\\geckodriver.exe");
		 driver=new FirefoxDriver();
			driver.get("http://www.google.co.in");  

	  }
	  else
	  {
		  System.out.println("unknown");
	  }

  }
  @Test(dataProvider="searchword")
  public void search(String x) throws Exception
  {
	driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);  
	Thread.sleep(3000);
	String t=driver.getTitle();
  
  if(t.contains(x))
  {
	  Assert.assertTrue(true,"google test pass");
	  
  }
  else
	{
	    Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd-mm-yy-hh-mm-ss");
	    String ssname=df.format(d);
	    File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File(ssname+".png");
	    FileUtils.copyFile(source,dest);
	    String path ="<img src=\"file:///H:\\mysele\\project1\\"+ssname+".png\"alt=\"\"/>";
	    Reporter.log(path);
	    Assert.assertTrue(false,"google title failed");
	}
  }
  @AfterMethod
  public void close()
  {
	  driver.close();
  }
}
