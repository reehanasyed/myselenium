package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activeelement {

	public static void main(String[] args) 
	{
		//site opening
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.co.in");
		//active element
		driver.switchTo().activeElement().click();
		

	}

}
