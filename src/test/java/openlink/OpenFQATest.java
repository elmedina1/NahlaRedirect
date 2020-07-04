package openlink;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FaqPage;
import pages.HomePage;
import pages.TuzlaPage;

public class OpenFQATest {

	private WebDriver driver;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//executable//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://nahla.ba/");

	}

	@Test(priority = 1)
	public void openFaqPageAndVerifyIt() {

		HomePage home = new HomePage(driver);
		FaqPage faq = home.clickFaqlink();
		String url = faq.getPageUrl();
		Assert.assertEquals(url, "https://nahla.ba/cpp-faq/", "User is not on correct page");
	}

	// open -nahla page - click on FAQ lin - click on Tyzla link - verify that user
	// is on page
	@Test(priority = 2)
	public void openTuzlaPageAndVerifyIt() {

		HomePage home = new HomePage(driver);
		FaqPage faq = home.clickFaqlink();
		
		  TuzlaPage tuzla =faq.clickTuzlaLink();
		  System.out.println("Tuzla title" + tuzla.getPageTitle());
	}

@AfterMethod
public void openNahla() {
	
	driver.get("https://nahla.ba/");
	System.out.println("After Method");
}
	
}
