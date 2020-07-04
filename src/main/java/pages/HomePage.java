package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	//define all locators in use for this page, after class definition
	private By faqLink = By.xpath("//a[@href=\"https://nahla.ba/cpp-faq/\"]");
	
	//define constructor
	
	public HomePage(WebDriver driver ) {
		//set global driver to passed driver instance
		this.driver = driver;
				
	}
	
	// click on Faq link
	public FaqPage clickFaqlink() {
		
		driver.findElement(faqLink).click();
		 return new FaqPage(driver);
	}
	

}
