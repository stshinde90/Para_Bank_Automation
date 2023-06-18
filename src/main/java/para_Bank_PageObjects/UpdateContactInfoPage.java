package para_Bank_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import para_Bank_AbstractComponent.Bank_AbstractComponent;

public class UpdateContactInfoPage extends Bank_AbstractComponent {
	
	public WebDriver driver;
	
	public UpdateContactInfoPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="[id='customer.phoneNumber']")
	WebElement txtbx_phoneNumber;
	//[type='submit']
	@FindBy(css="[type='submit']")
	WebElement btn_updateProfile;
	//[id='customer.address.state']
	@FindBy(css="[id='customer.address.state']")
	WebElement txtbx_stateName;	
	
	
	
	public void updatePhoneNumber() throws InterruptedException
	{
		txtbx_phoneNumber.clear();
		Thread.sleep(2000);
		txtbx_phoneNumber.sendKeys("5245-4525");
		Thread.sleep(2000);
	}
	
	public void updateStateName() throws InterruptedException
	{
		txtbx_stateName.clear();
		Thread.sleep(2000);
		txtbx_stateName.sendKeys("Mah");
		Thread.sleep(2000);
	}
	
	public void clickSubmit()
	{
		btn_updateProfile.click();
	}

}
