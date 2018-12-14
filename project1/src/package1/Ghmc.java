package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ghmc {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.ghmc.gov.in/sports/Login.aspx");
		driver.findElement(By.xpath("//*[text()='Register here']")).click();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddRegusertype"));
		Select s=new Select(e);
		Thread.sleep(4000);		
		s.selectByVisibleText("");

	}

}
