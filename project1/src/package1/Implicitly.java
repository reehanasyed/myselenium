package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		//driver.findElement(By.name("q")).sendKeys("facebook");
		driver.findElement(By.id("gsri_ok0")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

}
