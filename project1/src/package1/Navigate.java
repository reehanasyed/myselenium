package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open google site
		driver.get("htpp://www.gooogle.co.in");
		//navigate to
		driver.navigate().to("https://www.voot.com/");
		//refresh 
		driver.navigate().refresh();
		//again navigate
		driver.navigate().to("https://www.voot.com/shows/kaisi-yeh-yaariaan-s03/3/567537/hold-me-love-one-last-time/604512");
		//forward
		driver.navigate().forward();
		Thread.sleep(1000);
		//navigate to
		driver.navigate().to("https://www.instagram.com/");
		//back
		driver.navigate().back();
		driver.navigate().to("https://www.pinterest.com");
		Thread.sleep(1000);
		//refresh
		driver.navigate().refresh();
		driver.quit();
		

	}

}
