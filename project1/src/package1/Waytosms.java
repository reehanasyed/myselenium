package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waytosms {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		//registration of way2sms
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@value='Register Here']")).click();
		driver.findElement(By.xpath("//*[@id='female']/descendant::*[3]")).click();
		driver.findElement(By.name("name")).sendKeys("reehana");	
		driver.findElement(By.name("dob")).sendKeys("06/01/1993");
		driver.findElement(By.name("email")).sendKeys("sams.reehana4@gmail.com");
		driver.findElement(By.name("cemail")).sendKeys("sams.reehana4@gmail.com");
		driver.findElement(By.name("city")).sendKeys("chilakaluripet");
		driver.findElement(By.name("mno1")).sendKeys("8977771413");
		driver.findElement(By.name("captcha")).sendKeys("");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//*[@type='button']")).click();
	}

}
