package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getallselectedoptions {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	    driver.switchTo().frame("iframeResult");
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    WebElement e=driver.findElement(By.name("cars"));
	    Select s=new Select(e);
	    List<WebElement> l=s.getAllSelectedOptions();
	    for(int i=0;i<l.size();i++)
	    {
	    System.out.println(l.get(i).getText());
	    }
	    
	    
	    
	    }
	    }


