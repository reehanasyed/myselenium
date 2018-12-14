package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.mercurytravels.co.in/");
	    WebElement e=driver.findElement(By.name("nights"));
	    Select s=new Select(e);
	    Actions a=new Actions(driver);
	  
	    Thread.sleep(2000);
	  
	    if(s.isMultiple())
	    {
	    	System.out.println("is multiple");
	    }
	    else
	    {
	 	   System.out.println("is single select");

	    }
driver.close();

	}

}
