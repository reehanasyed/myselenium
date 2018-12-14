package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaHome 
 {
      public WebDriver driver;
      @FindBy(xpath="//a[text()='Profile']")
      public WebElement clickprof;
      
      @FindBy(xpath="//span[@aria-label='Options']")
      public WebElement setting;
      
      @FindBy(xpath="//button[text()='Log Out']")
      public WebElement logout;
      
      public InstaHome(WebDriver driver)
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver,this);
      }
      public void profile()
      {
    	  clickprof.click();
      }
      public void onsetting()
      {
    	  setting.click();
      }
      public void logout()
      {
    	  logout.click();
      }
 }
