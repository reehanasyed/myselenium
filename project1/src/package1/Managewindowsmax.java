package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Managewindowsmax {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pinterest.com");
		Thread.sleep(2000);
		//maximize the window in the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
				

	}

}
