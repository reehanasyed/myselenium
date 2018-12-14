 package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.id("draggable"));
		WebElement e2=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(e1, e2).build().perform();
		driver.close();
		

	}

}
