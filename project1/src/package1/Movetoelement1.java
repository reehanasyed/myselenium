package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Movetoelement1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		

	}

}
