package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Composepage {

	
       public WebDriver driver;
      
      
      @FindBy(xpath="(//*[text()='Primary'])[1]")
      public WebElement primary;
      //select 6th mail
      @FindBy(xpath="(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr[6]/td[2]/div")
      public WebElement mail6;
      //delete 
      @FindBy(xpath="//*[@aria-label='Delete']")
      public WebElement del;
      //profile pic
      @FindBy(xpath="//*[contains(@aria-label,'Google Account')]")
      public WebElement acc;
      //signout
      @FindBy(xpath="//*[text()='Sign out']")
      public WebElement signout;
       
      public Composepage(WebDriver driver)
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver,this);
    	  
      }
      public void clickprimary()
      {
    	  primary.click();
      }
      public void clickmail6()
      {
    	  mail6.click();
      }
      public void clickdel()
      {
    	  del.click();
      }
      public void clickacc()
      {
    	  acc.click();
      }
      public void clicksignout()
      {
    	  signout.click();
      }
	

}
