package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open insta webpage
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		//registration of user
		driver.findElement(By.name("emailOrPhone")).sendKeys("7396978883");
		driver.findElement(By.name("fullName")).sendKeys("reehanasyed");
		driver.findElement(By.name("username")).sendKeys("reehanasyed_06");
		driver.findElement(By.name("password")).sendKeys("reehana7*6");
        driver.findElement(By.xpath("//*[text()='Sign up']")).click();
        Thread.sleep(3000);
        //confirmation code
        driver.findElement(By.name("confirmationCode")).sendKeys();
        driver.findElement(By.xpath("//*[text()='Confirm']")).click();
        
	}

}
