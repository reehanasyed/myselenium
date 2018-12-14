package test_management_tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Mercurytravels {

	public static void main(String[] args) throws Exception, IOException 
	{
		File f=new File("Book1.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		WebElement e=driver.findElement(By.name("firstName"));
		ArrayList<String> a=new ArrayList<String>(driver.
				a.driver.findElement(By.name("firstName"));
//		for(int i=1;i<nour;i++) 
//		{
//			Cell r=rsh.getCell(0,i);
//			String x=r.getContents();
//		    if(e.isDisplayed()) 
//		    {
//		    	e.sendKeys(x);
//		    	e.sendKeys(Keys.TAB);
//		    }
//		    else
//		    {
//		    	
//		    }
//
//		}
		String x=rsh.getCell(0,1).getContents();
		String y=rsh.getCell(0,2).getContents();
		String z=rsh.getCell(0,3).getContents();
		String z1=rsh.getCell(0,4).getContents();
		String z2=rsh.getCell(0,5).getContents();
		String z3=rsh.getCell(0,6).getContents();
		String z4=rsh.getCell(0,7).getContents();
		String z5=rsh.getCell(0,8).getContents();
		String z6=rsh.getCell(0,9).getContents();
		e.sendKeys(x,Keys.TAB,y,Keys.TAB,z,Keys.TAB,z1,Keys.TAB,z2,Keys.TAB,
					z3,Keys.TAB,z4,Keys.TAB,z5,Keys.TAB,z6);
//		WebElement e1=driver.findElement(By.name("country"));
//	    Select s=new Select(e1);
//	    s.selectByValue("92");
//	 	String z7=rsh.getCell(0,10).getContents();
//		String z8=rsh.getCell(0,11).getContents();
//		String z9=rsh.getCell(0,12).getContents();
//		e1.sendKeys(z7,Keys.TAB,z8,Keys.TAB,z9,Keys.TAB);
//		driver.findElement(By.name("register")).submit();

		
			 	
		
		
			

		
		
	}

}
