package pomframework;

import java.io.File;

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

public class InstaTestClass 
{

	public static void main(String[] args) throws Exception 
	{
		File f=new File("Book121.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		ExtentReports er=new ExtentReports("insta.html",false);
		ExtentTest et=er.startTest("InstLoginTest");
		WebDriver driver=null;

		try
		{
			for(int i=1;i<nour;i++)
			{
				String bname=rsh.getCell(0,i).getContents();
				String u=rsh.getCell(1,i).getContents();
			String uc=rsh.getCell(2,i).getContents();
			String pw=rsh.getCell(3, i).getContents();
			String pc=rsh.getCell(4,i).getContents();
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
				OperaOptions oo=new OperaOptions();
				oo.setBinary("C:\\Program Files\\Opera");
				System.setProperty("webdriver.opera.driver","opera.exe");
				driver=new OperaDriver();
				
			}
			else
			{
				System.out.println("unknown browser");
				File src=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("browser test fail");
				FileUtils.copyFile(src, dest);
				et.log(LogStatus.UNKNOWN,"unknownBrowser");
				et.log(LogStatus.PASS, "unknown browse"+et.addScreenCapture("browse.png"));
				rwb.close();
				er.endTest(et);
				er.flush();
				System.exit(0);
			}
			
			
			//creating obj to page classes
			InstaLogin il=new InstaLogin(driver);
			InstaHome ih=new InstaHome(driver);
			driver.get("https://www.instagram.com/");
			WebDriverWait w=new WebDriverWait(driver,40);
			w.until(ExpectedConditions.visibilityOf(il.clicklogin));
			il.clicklogin();
				
			w.until(ExpectedConditions.visibilityOf(il.uid));
			il.filluid(u);
			//uid testing
			Thread.sleep(3000);
			  try
			  {
			  if(u.length()==0)
			  {
				  et.log(LogStatus.PASS,"blank uid test passed");
			  }
			  else if(uc.equals("invalid"))
			  {
				  et.log(LogStatus.PASS,"invalid uid test passed");
			  }
			  else if(uc.equals("valid") && (il.pwd.isDisplayed()))
			  {
				il.fillpwd(pw);  
				il.next();
				Thread.sleep(5000);
				try
				{
					if(pw.length()==0 && driver.findElement(By.xpath("//*[contains(text(),'Sorry, your password was incorrect.')]")).isDisplayed())
					  {
						  et.log(LogStatus.PASS, "blank pwd test passed");
					  }
					  else if(pc.equals("invalid") && driver.findElement(By.xpath("//*[contains(text(),'Sorry, your password was incorrect.')]")).isDisplayed())
					  {
						  et.log(LogStatus.PASS, "invalid pwd test passed");
					  }
					  else if(pw.equals("valid") && ih.clickprof.isDisplayed())
					  {
						  et.log(LogStatus.PASS,"valid pwd test passed");
						  
					  }
					  else
					  {
						    File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					    	File dest1=new File("testpwdfail.png");
					    	FileUtils.copyFile(src1,dest1);
					    	et.log(LogStatus.FAIL,"pwd test failed"+et.addScreenCapture("testpwdfail.png"));
					  } 
					
				}
				catch(Exception ep)
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
			  catch(Exception ep)
			  {
				  File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    	File dest1=new File("usertexterror.png");
			    	FileUtils.copyFile(src1,dest1);
			    	et.log(LogStatus.ERROR,"userid test interrupted"+et.addScreenCapture("usertexterror.png"));  
			  }
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
