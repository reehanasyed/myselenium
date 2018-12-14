package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click4link {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(1000);
		//List<WebElement> l=driver.findElements(By.tagName("a"));
		//l.get(7).click();
		//in place of list we can use the xpath
		driver.findElement(By.xpath("((//a)[1]")).click();
		
		

	}

}
