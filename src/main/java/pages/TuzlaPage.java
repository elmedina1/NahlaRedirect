package pages;

import org.openqa.selenium.WebDriver;

public class TuzlaPage {
	
	private WebDriver driver;
	
	
	public TuzlaPage(WebDriver driver) {
		this.driver = driver;
		
	}

	
	//
	
	public String getPageTitle() {
		
		
	return driver.getTitle();
		
	}
}
