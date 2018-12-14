package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Test1
{

	public static void main(String[] args) throws SikuliException, InterruptedException 
	{
		// launch youtube site(SWD)
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// Search for a video (SWD)
		driver.findElement(By.name("search_query")).sendKeys("abdul kalam speeches");
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']/child::*[1]")).click();
		Thread.sleep(5000);
		//click on video link(SWD)
		driver.findElement(By.partialLinkText("Abdul Kalam in European Parliament")).click();
		Thread.sleep(5000);//Wait for a advertisement to skip
		//Video icons automation(Sikulix)
		Screen s=new Screen();
		//move mouse pointer to video body & automate icons
		Location l=new Location(400,400);
		s.wheel(l,Button.LEFT,0);
		s.click("H:\\batch239\\project\\pause1.png");
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT, 0);
		s.click("H:\\batch239\\project\\play.png");
		Thread.sleep(5000);
		s.wheel(l, Button.LEFT, 0);
		s.click("H:\\batch239\\project\\volume.png");
		Thread.sleep(2000);
		Match e=s.find("H:\\batch239\\project\\Bubble.png");
		int x=e.getX();
		int y=e.getY();
		Location dl1=new Location(x-20,y);
		s.dragDrop(e,dl1);
		Location dl2=new Location(x+20,y);
		s.dragDrop(e,dl2);
		//Close site
		driver.close();
	}

}