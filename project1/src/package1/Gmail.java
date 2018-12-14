package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//keys
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open email webpage
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    Thread.sleep(3000);
	    //login
		driver.findElement(By.name("identifier")).sendKeys("sams.reehana4@gmail.com",Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("reehana@786",Keys.ENTER);
        int l=driver.findElements(By.xpath("//*[@id=':2l']")).size();
        System.out.println(l);
        //select the 2 mail 
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr[2]/td[2]")).click();
        Thread.sleep(4000);
        //delete mail
        driver.findElement(By.xpath("//*[contains(@style,'margin-right')]/descendant::div[11]/div[3]")).click();
        //click on signout
        driver.findElement(By.xpath("//*[@class='gb_db gbii']")).click();
        Thread.sleep(1000);
        //
        driver.findElement(By.xpath("//*[text()='Sign out']")).click();
        System.out.println(l);
        driver.close();
	}
	

}
