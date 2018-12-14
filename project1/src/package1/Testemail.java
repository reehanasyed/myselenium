package package1;


import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testemail {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter the email name");
	      String x=sc.nextLine();
		  WebDriver driver1=null;
		  System.setProperty("webdriver.chrome.driver", "H://chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  //open email webpage
		  driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		  Thread.sleep(3000);
		  if(x.equals("sams.reehana4@gmail.com"))
		  {
			    Thread.sleep(2000);
			    driver.findElement(By.name("identifier")).sendKeys("sams.reehana4@gmail.com",Keys.ENTER);
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("reehana@786",Keys.ENTER);
		  }
		  else if(x.equals("sujitha0257@gmail.com"))
		  { 
			Thread.sleep(5000);
		    driver.findElement(By.name("identifier")).sendKeys("sujitha0257@gmail.com",Keys.ENTER);
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sujithaS@6",Keys.ENTER);
		  }
		  else if(x.equals("reddy.kumar22@gmail.com"))
		  { 
			Thread.sleep(5000);
		    driver.findElement(By.name("identifier")).sendKeys("reddy.kumar22@gmail.com",Keys.ENTER);
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Sivareddy",Keys.ENTER);
		  }
		  else if(x.equals("syedbasha4a7@gmail.com"))
		  { 
			Thread.sleep(5000);
		    driver.findElement(By.name("identifier")).sendKeys("syedbasha4a7@gmail.com",Keys.ENTER);
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("HAMDARDH111",Keys.ENTER);
		  }
		  else
		  {
			  System.out.println("unknown");
		  }
		  driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		 driver.close();

	}

}
