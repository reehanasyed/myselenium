package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsizeandsetsizeofawindow {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pinterest.com/");
		Thread.sleep(1000);
		//get size
		int w=driver.manage().window().getSize().getWidth();
	    int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		//set size
		Thread.sleep(1000);
		Dimension d=new Dimension(355,256);
		driver.manage().window().setSize(d); 
		//get position
		Thread.sleep(1000);
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+""+y);
		Thread.sleep(2000);
		//set position
		Point p=new Point(300,700);
		driver.manage().window().setPosition(p);
		
		

		
		
		

	}

}
