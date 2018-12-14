package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simple1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","H:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Thread.sleep(4000);
		driver.get("https://www.google.co.in");
		

	}

}
