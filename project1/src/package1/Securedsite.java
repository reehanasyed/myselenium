package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Securedsite {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method 
		//website secured or not
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.instagram.com/");
		Thread.sleep(2000);
		//get the current url
		String x=driver.getCurrentUrl();
		//write the if condition
		if(x.contains("https"))
		{
		   System.out.println("is a secured");
		}
		else
		{
			System.out.println("not secured");
		}
        driver.close();
	}

}
