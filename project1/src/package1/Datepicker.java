package package1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year and month");
		String x=sc.nextLine();
		int x1=Integer.parseInt(x);
		System.out.println("enter a date");
		int y=sc.nextInt();
		System.setProperty("webdriver.chrome.driver","H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		WebDriverWait w=new WebDriverWait(driver,20);
		driver.switchTo().frame(0);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
		driver.findElement(By.id("datepicker")).clear();
		driver.findElement(By.id("datepicker")).click();
		driver.manage().window().maximize();
		
		while(2>1)
		{
			String dt=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			int dt1=Integer.parseInt(dt);
			if(x1<dt1)
			{
				driver.findElement(By.xpath("//*[text()='Prev']"));

			}
			else if(x1>dt1)
			{
				driver.findElement(By.xpath("//*[text()='Next']"));
			}
				
		
			
			break;
		}
		
	}

}
