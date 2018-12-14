package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		//lanuch site
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.co.in");
		//to get the title
		Thread.sleep(4000);
	    String x=driver.getTitle();
        System.out.println(x);
        //to get the current url
        String y=driver.getCurrentUrl();
        System.out.println(y);
        // to get the page source
        String z=driver.getPageSource();
        System.out.println(z);


	}

}
