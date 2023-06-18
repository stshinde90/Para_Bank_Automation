package para_Bank_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import para_Bank_AbstractComponent.Bank_AbstractComponent;

public class RequestLoanPage extends Bank_AbstractComponent{
	
	public WebDriver driver;
	
	public RequestLoanPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="#amount")
	WebElement txtbx_loanAmount;
	
	@FindBy(css="#downPayment")
	WebElement txtbx_downPayment;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_Submit;
	
	public void applyForLoan()
	{
		txtbx_loanAmount.sendKeys("500000");
		txtbx_downPayment.sendKeys("100000");
		btn_Submit.click();
	}

}
