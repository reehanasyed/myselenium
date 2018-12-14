package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptions {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.mercurytravels.co.in/");
	   /* WebElement e=driver.findElement(By.name("nights"));
	    Select s=new Select(e);
	    List<WebElement> l=s.getOptions();
	    s.selectByVisibleText("3Nights+4Days");
	    System.out.println(l.get(3).getText());
	    
	    System.out.println("no of items in a dropdown"+l.size()); 
	    for(int i=0;i<l.size();i++)
	    {
	    	System.out.println(l.get(i).getText());
	    }*/
	   WebElement e=driver.findElement(By.name("nights"));
	   Thread.sleep(2000);
	   Select s=new Select(e);
	   Thread.sleep(2000);
	   List<WebElement> l=s.getOptions();
	   Thread.sleep(2000);
	   //System.out.println(l);
	   Thread.sleep(2000);

	   for(int i=0;i<l.size();i++)
	   {
	   System.out.println(l.get(i).getText());
	   }
	   driver.close();

	    
	}

}
