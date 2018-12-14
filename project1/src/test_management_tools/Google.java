package test_management_tools;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Google {

	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String x=sc.nextLine();
		//create results using extent reports
		ExtentReports er=new ExtentReports("google1.html",false);
		ExtentTest et=er.startTest("google title test ");
		//open the browser
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		//find a element
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	    //check title
		String y=driver.getTitle();
		//to get screenshot of test passed
	    if(y.contains(x))
	    {
	    	File src=driver.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("testpass.png");
	    	FileUtils.copyFile(src,dest);
	    	et.log(LogStatus.PASS,"test pass");
	    	et.log(LogStatus.PASS,et.addScreenCapture("testpass.png"));
	    }
	    //to get screenshot of test failed
	    else
	    {
	    	File src1=driver.getScreenshotAs(OutputType.FILE);
	    	File dest1=new File("testfail.png");
	    	FileUtils.copyFile(src1,dest1);
	    	et.log(LogStatus.PASS,"test fail");
	    	et.log(LogStatus.PASS,et.addScreenCapture("testfail.png"));
	    }
		driver.close();
		er.endTest(et);
		//to save
		er.flush();


	}

}
