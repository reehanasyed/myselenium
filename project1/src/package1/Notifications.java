package package1;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Notifications {

	public static void main(String[] args) throws Exception 
	{
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("-incognito");
		//co.addArguments("window.my");
		//co.addArguments("--disable-popoup-blocking");
		//co.addArguments("--use-fake-ui-for-media-Strem=1");

//		ChromeOptions co=new ChromeOptions();
//		Map<String,Object> prefs=new HashMap<String,Object>();
//		//1-Allow, 2-Block, 0-default
//		prefs.put("profile.default_content_setting_values.notifications",1);
//		co.setExperimentalOption("prefs",prefs);
	System.setProperty("webdriver.chrome.driver","H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("hyderabad");
	}

}
