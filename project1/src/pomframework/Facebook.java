package pomframework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Facebook {

	public static void main(String[] args) throws Exception, Exception 
	{
		  WebDriver driver=null;

		  //reading data from excel
		  File f=new File("facebook.xls");
		  Workbook rwb=Workbook.getWorkbook(f);
		  Sheet rsh=rwb.getSheet(0);
		  int nour=rsh.getRows();
		  //open html for results using extent reports
		        ExtentReports er=new ExtentReports("fbresult.png");
		        ExtentTest et=er.startTest("fb login");
		  try
		  {
			  //automation with DDT in POm
			  for(int i=1;i<nour;i++)
			  {
    		  //get data from sheet
    		  String bname=rsh.getCell(0,i).getContents();
    		  String u=rsh.getCell(1,i).getContents();
    		  String uc=rsh.getCell(2,i).getContents();
    		  String p=rsh.getCell(3,i).getContents();
    		  String pc=rsh.getCell(4,i).getContents();
    		  
    		  LoginPage lp=new LoginPage();
    		  
    		  if(bname.equals("chrome"))
			  {
				  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				  driver=new ChromeDriver();
			  }
			  else
			  {
				  System.out.println("unknown");	 
			  }
    		  driver.get("https://www.facebook.com/");
    		  WebDriverWait w=new WebDriverWait(driver,50);
    		 // w.until(ExpectedConditions.visibilityOf(lp.name));
    		  driver.manage().window().maximize();
    		  lp.fillname(u);
    		  lp.fillpwd(p);
    		  lp.click();
    		  if(u.length()==0 && driver.findElement(By.xpath("//*[text()='Wrong credentials']")).isDisplayed())
    		  {
    			  System.out.println(" blank user test passed");
    		  }
    		  else if(uc.equals("invalid") && driver.findElement(By.xpath("//*[text()='Wrong credentials']")).isDisplayed())
    		  {
    			  System.out.println("invalid user test passed");

    		  }
    		  else if(uc.equals("valid") && driver.findElement(By.name("pass")).isDisplayed())
    	      {
    			 System.out.println("valid user test passed"); 
    			 try
    			 {
    				 if(p.length()==0 && driver.findElement(By.xpath("//*[text()='Wrong credentials']")).isDisplayed())
    				 {
    					 System.out.println("blank password");
    				 }
    				 else if(pc.equals("invalid") && driver.findElement(By.xpath("//*[text()='Wrong credentials']")).isDisplayed())
    				 {
    				   System.out.println("invalid password");
    				 }
    				 else if(p.equals("valid") && driver.findElement(By.xpath("(//*[text()='Facebook'])[2]")).isDisplayed())
    				 {
    					 System.out.println("valid password");
    				 }
    				 else
    				 {
    					 System.out.println("test failed");
    				 }
    				
    			 }catch(Exception ep)
    			 {
    				 System.out.println(ep.getMessage());
    			 }
    		  }
    		  else
    		  {
    			  System.out.println("test failed");
    		  }
    		
    	  }
      }
      catch(Exception ex)
      {
    	  System.out.println(ex.getMessage());
      }
      
      
	}

}
