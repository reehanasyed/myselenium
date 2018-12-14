package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) throws Exception 
	{
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.mindqsystems.com");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//*[@href='#'])[1]"));
		Thread.sleep(2000);
		WebElement z=driver.findElement(By.xpath("(//*[@class='dropdown-menu'])[1]/descendant::a[1]"));
		//WebElement w=driver.findElement(By.id("aboutmindq"));
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.clickAndHold(e).moveToElement(z).release(e).build().perform();
		

	}

}
