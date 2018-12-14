package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Sikuliyoutube {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		   ChromeDriver d=new ChromeDriver();
		   d.get("https://www.youtube.com");
	       d.manage().window().maximize();
	       d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       d.findElement(By.name("search_query")).sendKeys("sachin Tendulkar ");
	       Thread.sleep(2000);
	       d.findElement(By.xpath("//*[@id='search-icon-legacy']/child::*[1]")).click();
	       d.findElement(By.xpath("//*[contains(@title,'WTD | S3E5 | Sachin Tendulkar & Virender Sehwag | What The Duck | Viu India')]")).click();
	       Screen s=new Screen();
//	       Thread.sleep(2000);
//	       if(s.exists("H:\\batch239\\project\\skip1.png")!=null)
//	       {
//	       	s.click("H:\\batch239\\project\\skip1.png");
//	       }
	       Location l=new Location(400,400);
	       s.wheel(l,Button.LEFT,0);
	       Thread.sleep(3000);
	       s.click("H:\\batch239\\project\\pause1.png");
	       //d.close();

	}

}
