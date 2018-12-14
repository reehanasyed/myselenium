package package1;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception 
	{
		// launch a site
		System.setProperty("webdriver.chrome.driver", "H:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open fb page
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//login
		driver.findElement(By.name("email")).sendKeys("sams.reehana4@gmail.com");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		driver.findElement(By.name("pass")).sendKeys("reehana7*6");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.name(""))
		//driver.findElement(By.xpath("(//*[@name='submit[Continue]'])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\'u_2_7\']/div[1]/label[2]/span")).click();
		

	}

}
