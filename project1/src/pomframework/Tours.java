package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tours 
{
	WebDriver driver;
	@FindBy(xpath="//*[text()='REGISTER']")
	public WebElement reg;
	
	@FindBy(name="firstName")
	public WebElement fname;
	
	@FindBy(name="lastName")
	public WebElement lname;
	
	@FindBy(name="phone")
	public WebElement phone;
	
	@FindBy(name="userName")
	public WebElement email;
	
	@FindBy(name="address1")
	public WebElement add1;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="postalCode")
	public WebElement postal;
	
	@FindBy(name="country")
	public WebElement country;
	
	@FindBy(name="email")
	public WebElement uname;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(name="confirmPassword")
	public WebElement cpwd;
		
	public Tours(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickreg()
	{
		reg.click();
	}
	public void mfname(String x)
	{
		fname.sendKeys(x);
	}
	public void mlname(String x)
	{
		lname.sendKeys(x);
	}
	public void mphn(String x)
	{
		phone.sendKeys(x);
	}
	public void memail(String x)
	{
		email.sendKeys(x);
	}
	public void madd1(String x)
	{
		add1.sendKeys(x);
	}
	public void mcity(String x)
	{
		city.sendKeys(x);
	}
	public void mstate(String x)
	{
		state.sendKeys(x);
	}
	public void mpostal(String x)
	{
		postal.sendKeys(x);
	}
	public void mcunty()
	{
		country.click();
		Select s=new Select((WebElement) driver);
		s.selectByVisibleText("INDIA ");
	}
	public void muname(String x)
	{
		uname.sendKeys(x);
	}
	public void mpwd(String x)
	{
		pwd.sendKeys(x);
	}
	public void mcpwd(String x)
	{
		cpwd.sendKeys(x);
	}
	
}
