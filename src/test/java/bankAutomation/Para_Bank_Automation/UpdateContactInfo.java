package bankAutomation.Para_Bank_Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import bankAutomation_TestComponent.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import para_Bank_AbstractComponent.Bank_AbstractComponent;
import para_Bank_PageObjects.AccountOverviewPage;
import para_Bank_PageObjects.LandingPage;
import para_Bank_PageObjects.RequestLoanPage;
import para_Bank_PageObjects.UpdateContactInfoPage;

public class UpdateContactInfo extends BaseTest {

	public Bank_AbstractComponent bac;
	public UpdateContactInfoPage ucip;

	// BaseTest bt = new BaseTest();

	@Test
	public void updateContactDetails() throws InterruptedException, IOException {
		Thread.sleep(3000);
		bac = new Bank_AbstractComponent(driver);
		ucip = bac.goToUpdateProfile();
		ucip.updatePhoneNumber();
	}

	@Test(dependsOnMethods = { "updateContactDetails" })
	public void updateStateName() throws InterruptedException {
		ucip.updateStateName();
	}

	@Test(dependsOnMethods = { "updateStateName" })
	public void submitAllInfo() throws InterruptedException {
		ucip.clickSubmit();
	}
}
