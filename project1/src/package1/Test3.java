package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
