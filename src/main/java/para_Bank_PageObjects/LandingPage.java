package para_Bank_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import para_Bank_AbstractComponent.Bank_AbstractComponent;

public class LandingPage extends Bank_AbstractComponent {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(name="username")
	WebElement txtbx_username;
	
	@FindBy(name="password")
	WebElement txtbx_password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_submit;
	
	public void goTo()
	{
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}
	
	public AccountOverviewPage login_Application(String username, String Password)
	{
		txtbx_username.sendKeys(username);
		txtbx_password.sendKeys(username);
		btn_submit.click();	
		AccountOverviewPage aop = new AccountOverviewPage(driver);
		return aop;
		
		
	}
	
	
	
	
	
	

}
