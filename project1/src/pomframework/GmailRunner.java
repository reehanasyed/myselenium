package pomframework;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class GmailRunner {

	public static void main(String[] args) throws Exception, IOException
	{
		//jxl for reading the data
		File f=new File("gmail.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		//html file for results using extent reports
		ExtentReports er=new ExtentReports("gmailpom.html");
		ExtentTest et=er.startTest("gmail login");
		//automation 
		try
		{
			for(int i=1;i<nour;i++)
			{
			 String bname=rsh.getCell(0,i).getContents();
			 String u=rsh.getCell(1,i).getContents();
			 String uc=rsh.getCell(2,i).getContents();
			 String p=rsh.getCell(3,i).getContents();
			 String pc=rsh.getCell(4,i).getContents();
			 WebDriver driver=null;
			 if(bname.equals("chrome"))
			  {
				  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				  driver=new ChromeDriver();
			  }
			  else if(bname.equals("firefox"))
			  {
				  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
				 driver=new FirefoxDriver();
			  }
			  else if(bname.equals("opera"))
			  {
				  OperaOptions o=new OperaOptions();
				  o.setBinary("C:\\Program Files\\Opera");
				  System.setProperty("webdriver.opera.driver","operadriver.exe");
				  driver=new OperaDriver(o);
			  }
			  else
			  {
				  et.log(LogStatus.SKIP,"unknown browser");
				  //save and close excel
				  rwb.close();
				  //save and close extent report
				  er.endTest(et);
				  er.flush();
				  System.exit(0);
			  }
			//create objects to page classes
			  Homepage hp=new Homepage(driver);
			  Passwordpage pp=new Passwordpage(driver);
			  Composepage cp=new Composepage(driver);
			  //launch site
			  driver.get("http://www.gmail.com");
			  WebDriverWait w=new WebDriverWait(driver,100);
			  w.until(ExpectedConditions.visibilityOf(hp.uid));
			  driver.manage().window().maximize();
			  //do login
			  hp.filluid(u);
			  hp.clickuidnext();
			  Thread.sleep(3000);
			  try
			  {
			  if(u.length()==0 && driver.findElement(By.xpath("//*[text()='Enter an email or phone number']")).isDisplayed())
			  {
				  et.log(LogStatus.PASS,"blank uid test passed");
			  }
			  else if(uc.equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
			  {
				  et.log(LogStatus.PASS,"invalid uid test passed");
			  }
			  else if(uc.equals("valid") && (pp.pwd.isDisplayed()))
			  {
				  pp.fillpwd(p);
				  pp.clickpwdnext();
				  Thread.sleep(5000);
				  try
				  {
					  if(p.length()==0 && driver.findElement(By.xpath("//*[text()='Enter a password']")).isDisplayed())
					  {
						  et.log(LogStatus.PASS, "blank pwd test passed");
					  }
					  else if(pc.equals("invalid") && driver.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']")).isDisplayed())
					  {
						  et.log(LogStatus.PASS, "invalid pwd test passed");
					  }
					  else if(p.equals("valid") && cp.acc.isDisplayed())
					  {
						  et.log(LogStatus.PASS,"valid pwd test passed");
						  w.until(ExpectedConditions.visibilityOf(cp.primary));
//						  cp.clickprimary();
//						  cp.clickmail6();
//						  cp.clickdel();
//						  cp.clickacc();
//						  w.until(ExpectedConditions.visibilityOf(cp.signout));
//						  cp.clicksignout();
//						  Thread.sleep(5000);
					  }
					  else
					  {
						    File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					    	File dest1=new File("testpwdfail.png");
					    	FileUtils.copyFile(src1,dest1);
					    	et.log(LogStatus.FAIL,"pwd test failed"+et.addScreenCapture("testpwdfail.png"));
					  } 
				  }
				  catch(Exception ex)
				  {
					    File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    	File dest1=new File("testpwderror.png");
				    	FileUtils.copyFile(src1,dest1);
				    	et.log(LogStatus.ERROR,"pwd test interrupted"+et.addScreenCapture("testpwderror.png"));  
				  }
			  }
			  else
			  {
				    File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    	File dest1=new File("usertextfail.png");
			    	FileUtils.copyFile(src1,dest1);
			    	et.log(LogStatus.FAIL,"userid test failed"+et.addScreenCapture("usertextfail.png"));
			 
			  }
			}	
		catch(Exception e)
	    {
			 File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    	File dest1=new File("usertexterror.png");
		    	FileUtils.copyFile(src1,dest1);
		    	et.log(LogStatus.ERROR,"userid test interrupted"+et.addScreenCapture("usertexterror.png"));  
		  }	
			  driver.close();
		}
	    
		}
		catch(Exception ep)
		{
			et.log(LogStatus.ERROR,ep.getMessage());
		}
		//save and close excel
		rwb.close();
		//save and close extent report
		er.endTest(et);
		er.flush();
		}
	}


