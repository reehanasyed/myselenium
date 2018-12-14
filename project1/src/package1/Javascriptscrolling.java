package package1;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptscrolling {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "H://geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(2000);
		//scroll to down
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		//scroll to up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		//scroll to specific element
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		

	}

}
