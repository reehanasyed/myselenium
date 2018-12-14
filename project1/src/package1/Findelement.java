package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//open the browser
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open a website
		driver.get("http:\\www.google.co.in");
		//find a element
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.close();
		

	}

}
