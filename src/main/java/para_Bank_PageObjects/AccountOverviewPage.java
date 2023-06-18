package para_Bank_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import para_Bank_AbstractComponent.Bank_AbstractComponent;

public class AccountOverviewPage extends Bank_AbstractComponent {
	
	public WebDriver driver;
	
	public AccountOverviewPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@ng-app='OverviewAccountsApp']//h1")
	WebElement txt_accountOverview;
	
	
	public String textVerify()
	{
		String AccountVerify_Text = txt_accountOverview.getText();
		return AccountVerify_Text;
	}

}
