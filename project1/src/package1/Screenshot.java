package package1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception
	{
      //open a site
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.maxfashion.in/");
		//get screen shot
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("H:\\batch239\\max.png");
		FileUtils.copyFile(src,dest);
		driver.close();
		
	}

}
