package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaqPage {
	private WebDriver driver;
	private By tuzlaLink = By.xpath("//a[@href=\"http://tuzla.nahla.ba/\"]");
	
	
	//constructor
	public FaqPage(WebDriver driver) {
		
		this.driver =driver;
		
	}

	//get element
	public String getPageUrl() {
		
		return driver.getCurrentUrl();
	}
	
	
	
	//click on Tuzla link
	
	public TuzlaPage clickTuzlaLink() {
		
		driver.findElement(tuzlaLink).click();
		return new TuzlaPage(driver);
	}
	
}
