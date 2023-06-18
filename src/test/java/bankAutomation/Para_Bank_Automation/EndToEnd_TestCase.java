package bankAutomation.Para_Bank_Automation;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bankAutomation_TestComponent.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import para_Bank_PageObjects.AccountOverviewPage;
import para_Bank_PageObjects.LandingPage;
import para_Bank_PageObjects.RequestLoanPage;

public class EndToEnd_TestCase extends BaseTest {

	@Test()
	public void endToEndTest() throws InterruptedException {
		// launch browser and open application is written in BaseTest(BeforeMethod
		// method)
		// ********** login to application***********

		AccountOverviewPage aop = landingPage.login_Application("John", "John123");
		Thread.sleep(3000);

		// On Account Overview page verify title as "Accounts Overview"
		String TitleText = aop.textVerify();
		Assert.assertTrue(TitleText.equalsIgnoreCase("Accounts Overview"));

		// request for loan(put all details on the page and hit "Apply Now"
		RequestLoanPage rlp = aop.goToRequestLoan();
		rlp.applyForLoan();

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		/*
		 * HashMap <String,String> map = new HashMap <String,String>();
		 * map.put("email","AutoamtionQA@gmail.com"); map.put("password","Test@123");
		 * map.put("productName","ZARA COAT 3");
		 * 
		 * HashMap <String,String> map1 = new HashMap <String,String>();
		 * map1.put("email","AutoamtionQA@gmail.com"); map1.put("password","Test@123");
		 * map1.put("productName","ZARA COAT 3");
		 */

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\src\\test\\java\\bankAutomation\\Data\\loginCreds.json");

		return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

}
