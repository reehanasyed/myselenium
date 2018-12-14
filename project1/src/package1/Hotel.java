package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hotel {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/index.php");
		Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("reehanasyed");
        driver.findElement(By.name("password")).sendKeys("reehana7*6");
		Thread.sleep(5000);
        driver.findElement(By.name("login")).click();
        WebElement e=driver.findElement(By.name("location"));
        Select s=new Select(e);
        s.selectByValue("Sydney");
        WebElement e1=driver.findElement(By.id("hotels"));
        Select s1=new Select(e1);
        s1.selectByValue("Hotel Sunshine");
        WebElement e2=driver.findElement(By.id("room_type"));
        Select s2=new Select(e2);	
        s2.selectByValue("Super Deluxe");
        WebElement e3=driver.findElement(By.name("room_nos"));
        Select s3=new Select(e3);
        s3.selectByValue("10");
        WebElement e4=driver.findElement(By.id("datepick_in"));
        e4.clear();  
        e4.sendKeys("06/01/2019");
        WebElement e5=driver.findElement(By.id("datepick_out"));
        e5.clear();
        e5.sendKeys("16/01/2019");
        WebElement e6=driver.findElement(By.id("adult_room"));
        Select s4=new Select(e6);
        s4.selectByValue("2");
        WebElement e7=driver.findElement(By.id("child_room"));
        Select s5=new Select(e7);
        s5.selectByValue("3"); 
        Thread.sleep(3000);
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.name("radiobutton_0")).click();
        driver.findElement(By.name("continue")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("first_name")).sendKeys("reehana");
        driver.findElement(By.name("last_name")).sendKeys("syed");
        driver.findElement(By.name("address")).sendKeys("near sarada high school \n kavamma temple \n chilakaluripet 522616");
       
        
        
        
        

	}

}
