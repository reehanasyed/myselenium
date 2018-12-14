package aitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    driver.findElement(By.xpath("//*[text()='Search Buses']")).click();

	}

}
