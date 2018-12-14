package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdownwithdeselect {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	    driver.switchTo().frame("iframeResult");
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    WebElement e=driver.findElement(By.name("cars"));
	    Select s=new Select(e);
	    Actions a=new Actions(driver);
	    Thread.sleep(1000);
	    for(int i=0;i<4;i++)
	    {
	    	a.keyDown(Keys.CONTROL).build().perform();
	    	 a.click(s.getOptions().get(i)).build().perform();
	    	 a.keyUp(Keys.CONTROL).build().perform();
	    }
	    Thread.sleep(1000);
	    s.deselectAll();
	   // s.deselectByIndex(2);
	   // s.deselectByValue("audi");
	   driver.close();

	}

}
