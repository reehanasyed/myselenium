package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Getfirstselectedoption {

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
			    a.keyDown(Keys.CONTROL).build().perform();
			    a.click(s.getOptions().get(2)).build().perform();
			    a.click(s.getOptions().get(0)).build().perform();
			    a.keyUp(Keys.CONTROL).build().perform();
			    /*List<WebElement> l=s.getAllSelectedOptions();
			    for(int i=0;i<l.size();i++)
			    {
			    System.out.println(l.get(i).getText());
			  // System.out.println(l.get(2).getText());
			   }
			    Thread.sleep(2000);
			    s.deselectByVisibleText("Opel");*/
			   s.selectByValue("audi");
			    String x=s.getFirstSelectedOption().getText();    
			    System.out.println(x);
			    driver.close();
			    
				    
	}
}
