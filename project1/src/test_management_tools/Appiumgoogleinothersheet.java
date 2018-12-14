package test_management_tools;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Appiumgoogleinothersheet {

	public static void main(String[] args) throws Exception
	{

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability("deviceName","60c18edf");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		//start Appium server
			Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		    URL u=new URL("http://0.0.0.0:4723/wd/hub");
		    AndroidDriver driver;
		     while(2>1)
		     {
		     	try
		     	{
		     		driver=new AndroidDriver(u,dc);
		     		break;
		     	}
		     	catch(Exception ex)
		     	{
		     	}
		     	
		     }
		        File f=new File("family.xls");
				Workbook rwb=Workbook.getWorkbook(f);
				Sheet rsh=rwb.getSheet(0);
				int nour=rsh.getRows();
				int nouc=rsh.getColumns();
				//open same excel file for writing
				WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
				WritableSheet wsh=wwb.getSheet(2);
				try
				{
					for(int c=0;c<nouc;c++)
					{
					Label l1=new Label(c,0,"result1");
					wsh.addCell(l1);
					
				    for(int i=1;i<nour;i++)
				{
					String x=rsh.getCell(0,i).getContents();
					driver.get("http://www.google.co.in");
					WebDriverWait w=new WebDriverWait(driver,100);
					w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
					driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
					String y=driver.getTitle();
					if(y.contains(x))
					{
						Label l2=new Label(c,i,"test passed");
						wsh.addCell(l2);
					}
					else
					{
						File src=driver.getScreenshotAs(OutputType.FILE);
				    	File dest=new File("failexcel.png");
				    	FileUtils.copyFile(src,dest);
				    	Label l3=new Label(nouc,i,"test failed:"+dest.getAbsolutePath());
				    	wsh.addCell(l3);
					}
				}
					}
				
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				driver.closeApp();
				wwb.write();
				wwb.close();
				rwb.close();
				Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
