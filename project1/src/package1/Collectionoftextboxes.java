package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionoftextboxes {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","H:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/");
		Thread.sleep(2000);
		List<WebElement> l=driver.findElements(By.xpath("(//input[@type='text'])|(//a[@href])|(//link[@href])"));
		System.out.println("no:of text box in a page are:"+l.size());
		driver.close();
	}

}
