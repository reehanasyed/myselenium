package package1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Divwithmultiselect2 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no item to be select \n");
		int n=Integer.parseInt(s.nextLine());
		ArrayList<String> al=new ArrayList<String>();
		System.out.println(" enter the item to be select \n");
		for(int i=0;i<n;i++)
		{
			al.add(s.nextLine());
			Collections.sort(al);
		}
		
		System.setProperty("webdriver.chrome.driver","H://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']")).click();
		Actions a=new Actions(driver);
		
		for(int i=0;i<n;i++)
		{
			while(2<5)
			{
				String x=driver.findElement(By.xpath("(//*[@class='item selected'])[1]")).getAttribute("data-value");
				if(x.equalsIgnoreCase(al.get(i)))
				{
					a.sendKeys(Keys.ENTER).build().perform();
					break;
					
				}
				else
				{
					a.sendKeys(Keys.DOWN).build().perform();
					Thread.sleep(3000);
				}
			}
		}
		driver.findElement(By.xpath("(//*[@class='delete icon'])[1]")).click();

	}

}
