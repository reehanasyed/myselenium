package package1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailjavarobot {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    //open email webpage
    	driver.get("http://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    //login
		driver.findElement(By.id("identifierId")).sendKeys("sams.reehana4@gmail.com",Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("reehana@786",Keys.ENTER);
        driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
        driver.findElement(By.name("to")).sendKeys("sams.reehana4@gmail.com");  
        driver.findElement(By.name("subjectbox")).sendKeys("java robot");  
        driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]"))
        .sendKeys("hiiii\n im automating the java robot\n with the combination of swd and java robot\n");    
        driver.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
        StringSelection s=new StringSelection("G:\\certificates\\pan card.jpg");
        Thread.sleep(6000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        WebDriverWait w=new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"dQ\"]")));
        driver.findElement(By.xpath("//*[text()='Send']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='vh'])[1]")));
        String x=driver.findElement(By.xpath("(//*[@class='vh'])[1]")).getText();
        System.out.println(x);
        

	}

}
