package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getatticsstext {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stuber
		//getAttribute()
		//getCssValue()
		//getText()
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		//get attribute
		String x=driver.findElement(By.name("q")).getAttribute("title");
		System.out.println(x);
		//get cssvalue
		String y=driver.findElement(By.name("q")).getCssValue("border");
		System.out.println(y);
		//get text
		String z=driver.findElement(By.name("q")).getText();
		System.out.println(z);
		driver.close();

}
}