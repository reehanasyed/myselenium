package pomframework;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class RunnerTours {

	public static void main(String[] args) throws Exception 
	{
	
	File f=new File("tours.xls");
	Workbook rwb=Workbook.getWorkbook(f);
	Sheet rsh=rwb.getSheet(0);//o means sheet1
	int nour=rsh.getRows();
	//int nouc=rsh.getColumns();
	//open same excel file for writing
//	WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
//	WritableSheet wsh=wwb.getSheet(0);
	WebDriver driver=null;
	//automation
	try
	{	
		String register=null;
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
		Tours t=new Tours(driver);
		driver.get("http://www.newtours.demoaut.com/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(t.reg));
		driver.manage().window().maximize();
		t.clickreg();
		for(int i=1;i<nour;i++)
		{
			register=rsh.getCell(0,i).getContents();
		
			
		}
		
		t.mfname(register);
		t.mlname(register);
		t.mphn(register);
		t.memail(register);
		t.madd1(register);
		t.mcity(register);
		t.mstate(register);
		t.mpostal(register);
	}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	      rwb.close();
	      
	}

}
