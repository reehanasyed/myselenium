package keyworddrivenframework;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mymethods 
{
	public WebDriver driver;
	public WebDriverWait w;
	public String launch(String e,String d,String c)throws Exception
	{
		if(e.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
			  driver=new ChromeDriver();
		  }
		  else if(e.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","H:\\geckodriver.exe");
			 driver=new FirefoxDriver();
		  }
		  else
		  {
			  return("unknown");
		  }
		driver.get(d);
		w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNo")));
		driver.manage().window().maximize();
		return("done");
	}
	public String fill(String e,String d,String c)throws Exception
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
		driver.findElement(By.xpath(e)).sendKeys(d);
		return("done");
	}
	public String click(String e,String d,String c)throws Exception
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
		driver.findElement(By.xpath(e)).click();
		return("done");
	}
	public String validateLogin(String e,String d,String c)throws Exception
	{
		try
		{
			if(c.equals("all_valid")&& driver.findElement(By.xpath("//*[text()='SendSMS']")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("mbno_blank")&& driver.findElement(By.xpath("//*[text()='Enter your mobile number']")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("mbno_invalid")&& driver.findElement(By.xpath("(//*[contains(text(),'Your mobile number is not register')])[1]")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("pwd_blank")&& driver.findElement(By.xpath("(//*[text()='Enter password'])[1]")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("pwd_invalid")&& driver.findElement(By.xpath("(//*[contains(text(),'Incorrect number or password')])[1]")).isDisplayed())
			{
				return("passed");
			}
			else
			{
				String temp=this.screenshot();
				return("test failed & goto "+ temp +".png");

			}
			
		}catch(Exception ex)
		{
			String temp=this.screenshot();
			return("test interrupted & goto "+ temp +".png");
		}
	}
	public String closeSite(String e,String d,String c) throws Exception
	{
		driver.close();
		return("done");
	}
	public String screenshot()throws Exception
	{
		Date dt=new Date();
		String ssname=dt.toString();
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(ssname+".png");
		FileUtils.copyFile(src, dest);
		return(ssname);
	}

}
