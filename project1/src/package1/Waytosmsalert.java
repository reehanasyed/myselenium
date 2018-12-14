package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waytosmsalert {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/entry?ec=0080&id=0.5098863163645402");
		driver.findElement(By.name("username")).sendKeys("8977771413");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(3000);
		//alert window
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("reehana786");
		//driver.findElement(By.name(""))
		//Thread.sleep(3000);
		//String x=driver.switchTo().alert().getText();
		//System.out.println(x);
		driver.close();
	
	}

}
