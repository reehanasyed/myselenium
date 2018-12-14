package pomframework;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {


	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			  System.out.println("enter the browser name");
		      String x=sc.nextLine();
			  WebDriver driver=null;
			  //browser compatibility
			  if(x.equals("chrome"))
			  {
				  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				  driver=new ChromeDriver();
			  }
			  else if(x.equals("firefox"))
			  {
				  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
				 driver=new FirefoxDriver();
			  }
			  else if(x.equals("opera"))
			  {
				  OperaOptions o=new OperaOptions();
				  o.setBinary("C:\\Program Files\\Opera");
				  System.setProperty("webdriver.opera.driver","operadriver.exe");
				  driver=new OperaDriver(o);
			  }
			  else
			  {
				  System.out.println("unknown browser");
				  System.exit(0);
			  }
			  //create objects to page classes
			  Homepage hp=new Homepage(driver);
			  Passwordpage pp=new Passwordpage(driver);
			  Composepage cp=new Composepage(driver);
			  //launch site
			  driver.get("http://www.gmail.com");
			  WebDriverWait w=new WebDriverWait(driver,100);
			  w.until(ExpectedConditions.visibilityOf(hp.uid));
			  driver.manage().window().maximize();
			  //do login
			  hp.filluid("sams.reehana4@gmail.com");
			  hp.clickuidnext();
			  w.until(ExpectedConditions.visibilityOf(pp.pwd));
			  pp.fillpwd("reehana@786");
			  pp.clickpwdnext();
			  //mail delete
			  w.until(ExpectedConditions.visibilityOf(cp.primary));
			  cp.clickmail6();
			  w.until(ExpectedConditions.visibilityOf(cp.del));
			  cp.clickdel();
			  cp.clickacc();
			  cp.clicksignout();
			  //close site
			  driver.close();
			  }
		catch(Exception ex)
		{
			//System.out.println(ex.getMessage());
		}

	}

}
