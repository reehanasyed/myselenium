package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//open site
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//delete all the cookies
		driver.manage().deleteAllCookies();
		//open a website
		driver.get("https://in.pinterest.com/");
		//cookies loaded
		
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("cookies are loded");
		
		}
		else
		{
			System.out.println("cookies are not load");
		}
		
		driver.close();

	}

}
