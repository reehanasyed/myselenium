package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//facebook
public class LoginPage
{
	public WebDriver driver;
	
	@FindBy(name="email")
	public WebElement name;
	
	@FindBy(name="pass")
	public WebElement pwd;
	
	@FindBy(xpath="//*[@aria-label='Log In']")
	public WebElement login;
	
	public void LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillname(String x)
	{
		name.sendKeys(x);
	}
	
	public void fillpwd(String x)
	{
		pwd.sendKeys(x);
	}
	 
	public void click()
	{
		login.click();
	}
	
	

}
