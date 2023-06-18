package para_Bank_AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import para_Bank_PageObjects.RequestLoanPage;
import para_Bank_PageObjects.UpdateContactInfoPage;

public class Bank_AbstractComponent {

	public WebDriver driver;

	public Bank_AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[href*='requestloan']")
	WebElement lnk_requestLoan;

	@FindBy(css = "[href*='updateprofile']")
	WebElement lnk_updateProfile;

	public UpdateContactInfoPage goToUpdateProfile() {
		lnk_updateProfile.click();
		UpdateContactInfoPage ucip = new UpdateContactInfoPage(driver);
		return ucip;
	}

	public RequestLoanPage goToRequestLoan()//
	{
		lnk_requestLoan.click();
		RequestLoanPage rlp = new RequestLoanPage(driver);
		return rlp;
	}

	public void waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	public void waitForElementToVisible(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToDisappear(WebElement ele) throws InterruptedException {

		Thread.sleep(3000);
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.invisibilityOf(ele));
	}

}
