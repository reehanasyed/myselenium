package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLogin 
 {
     public WebDriver driver;
     
     @FindBy(xpath="//*[text()='Log in']")
     public WebElement clicklogin;
     
     @FindBy(id="f1614608fef5308")
     public WebElement uid;
     
     @FindBy(id="f383ecb5467903")
     public WebElement pwd;
     
    @FindBy(xpath="//button[text()='Log in']")
    public WebElement next;
     
     
     
     public InstaLogin(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
     }
     public void clicklogin()
     {
    	 clicklogin.click();
     }
     public void filluid(String x)
     {
    	 uid.sendKeys(x);
     }
     public void fillpwd(String x)
     {
    	 pwd.sendKeys(x);
     }
     public void next()
     {
    	 next.click();
     }
 }



